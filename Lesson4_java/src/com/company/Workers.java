package com.company;

public class Workers {
    String name;
    String position;
    String email;
    long numberTelefon;
    int salary;
    int age;

    public Workers(String _name, String _position, String _email, long _numberTelefon, int _salary, int _age){
        name = name;
        position = _position;
        email = _email;
        numberTelefon = _numberTelefon;
        salary =_salary;
        age = _age;
    }
    public void workersInfo(){
        System.out.println("Name:" + name + " Position " + position + " Email " + email + " Номер телефона " + numberTelefon + " Доход " + salary + " Возраст " + age);
    }


}
