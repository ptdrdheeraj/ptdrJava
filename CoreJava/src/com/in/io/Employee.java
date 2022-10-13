package com.in.io;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable{
	//transient attri. can't convert obj.to byte and byte to obj.without Externalizble interface
	private transient String name;
	private String Address;
	private transient int id;
	
	public Employee() {}
	public Employee(String n,String Add,int ID) {
		name = n;
		Address = Add;
		id = ID;
		
		
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return Address;
	}
	public int getId() {
		return id;
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeObject(Address);
		out.writeObject(id);
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		this.name = (String) in.readObject();
		this.Address = (String) in.readObject();
		this.id = (int) in.readObject();
	}
	
	
		
	
	}
