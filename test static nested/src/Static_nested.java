import java.util.*;
public class Static_nested<E> {
	private int a=100;
	private HashSet<Integer> idCodes;
	private static class Node<T>{
	
		private int value;
		public Node(){
			Static_nested<T>A=new Static_nested<T>();
			this.value=A.a;}
	}
	private Node<E> head=new Node();
	public void incearca()
	{
		System.out.println(head.value);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static_nested<String> g = new Static_nested<String>();
		g.incearca();
	}

}
