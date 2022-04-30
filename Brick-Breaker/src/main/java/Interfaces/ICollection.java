package main.java.Interfaces;

import main.java.Objects.GameObject;

public interface ICollection {

	public boolean add(GameObject obj);

	public IIterator getIterator();

	public boolean remove(GameObject obj);

	public int size();

}