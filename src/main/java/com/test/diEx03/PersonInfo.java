package com.test.diEx03;

public class PersonInfo {
	private Person person;
	
	public PersonInfo() {};//�⺻ ������

	public PersonInfo(Person person) {
		super();
		this.person = person;
	}; //���� ������
	
	public void getPersonInfo() {
		if(person != null) {
			System.out.println("�̸�: " + person.getName());
			System.out.println("����: " + person.getGender());
			System.out.println("����: " + person.getAge());
			System.out.println("�ֹι�ȣ: " + person.getIdNo());
			System.out.println("----------------------------");
		}
	} //getPersonInfo()
	
	public void setPerson(Person person) {
		this.person = person;
	} //setPerson()
	
}
