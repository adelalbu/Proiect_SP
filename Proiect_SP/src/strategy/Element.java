package strategy;

public interface Element {
	
	public void print();
	public void add(Element element);
	public void remove(Element element);
	
	public Element getElement(int index);



}
