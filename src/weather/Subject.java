package weather;

public interface Subject {
  public void regiterObserver(Observer o);
  public void remoeObserver(Observer o);
  public void notifyObserver();
}
