import java.util.ArrayList;
//this is observer pattern with pull method (observers extract data needed on notify)
public class Subject {
	private static int changed_var;
	private ArrayList<Observer_Me> observers;
	
	public Subject(){
		changed_var = 12;
		observers = new ArrayList<>();
		}
	public static int get_Var(){
		return changed_var;
	}
	public void change(int val){
		changed_var = val;
		notify_Ob();
	}
	
	private void notify_Ob(Observer_Me o){
		o.listen();
	}
	
	private void notify_Ob(){
		for(int i = 0; i< observers.size(); i++)
			notify_Ob(observers.get(i));
	}
	
	public void addObserver(Observer_Me o){
		observers.add(o);
		notify_Ob(o);
	}
}
