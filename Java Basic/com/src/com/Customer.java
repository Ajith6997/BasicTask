package com;


public final class Customer {
	public static Customer instance;
	public int Id;
	public String Name;
	public String Email;
	public int Dob;
	public String Status;
	public long Phoneno;

	private Customer() {
		Id = 369;
		Name = "Ajith";
		Email = "ajithjeevith@gmail.com";
		Dob = 6997;
		Status = "Single";
		Phoneno = 909529631;
	}
	

	public static Customer getInstance() {
		if (instance == null) {
			instance = new Customer();
		}
		return instance;

	}


	public int getId() {
		return Id;
	}

	public String getName() {
		return Name;
	}

	public String getEmail() {
		return Email;
	}

	public int getDob() {
		return Dob;
	}

	public String getStatus() {
		return Status;
	}

	public long getPhoneno() {
		return Phoneno;
	}
}