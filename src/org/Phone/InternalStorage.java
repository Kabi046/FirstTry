package org.Phone;

public class InternalStorage extends ExternalStorage {
public void intstr() {
	System.out.println("the internal storage is low");
}
public static void main(String[] args) {
	InternalStorage Int = new InternalStorage();
	Int.intstr();
	Int.Extstr();
}
}
