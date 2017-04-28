package org.noon.domain;

public class PageMaker {

	private Criteria cri;
	private int start, end, current, size, total;
	private boolean prev, next;

	public PageMaker(Criteria cri, int total) {
		this.cri = cri;
		this.total = total;
		this.current = cri.getPage();
		this.size = cri.getAmount();
		calcPage();
	}

	private void calcPage() {
		int tempEnd = (int) (Math.ceil(current / 10.0) * 10);

		start = tempEnd - 9;

		end = tempEnd * size > total ? (int) (Math.ceil(total / (double) size)) : tempEnd;

		prev = start == 1 ? false : true;

		next = end * size < total ? true : false;
	}

	public Criteria getCri() {
		return cri;
	}

	public void setCri(Criteria cri) {
		this.cri = cri;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public int getCurrent() {
		return current;
	}

	public void setCurrent(int current) {
		this.current = current;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public boolean isPrev() {
		return prev;
	}

	public void setPrev(boolean prev) {
		this.prev = prev;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "PageMaker [cri=" + cri + ", start=" + start + ", end=" + end + ", current=" + current + ", size=" + size
				+ ", total=" + total + ", prev=" + prev + ", next=" + next + "]";
	}

}
