public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    public double tax(){
        if(this.salary<1000){
            return 0;
        }
        return this.salary*3/100;
    }

    public double bonus(){
        if(workHours>40){
            return (workHours-40)*30;
        }
        return 0;
    }

    public double raiseSalary(){
        int year=2021-this.hireYear;
        if(year<10){
            return this.salary*5/100;
        }else if(year<20){
            return this.salary*1/10;
        }
        return this.salary*15/100;
    }

    public void toString(Employee employee){
        System.out.println("Adı: " + employee.name);
        System.out.println("Maasi: " + employee.salary);
        System.out.println("Calisma Saati: " + employee.workHours);
        System.out.println("Baslangic Yili: " + employee.hireYear);
        System.out.println("Vergi: " + employee.tax());
        System.out.println("Bonus: " + employee.bonus());
        System.out.println("Maas Artisi: " + employee.raiseSalary());
        System.out.println("Vergi ve bonuslar ile birlikte maas: " + (employee.salary+employee.bonus()-employee.tax()));
        System.out.println("Toplam maas: " + (employee.salary+ employee.raiseSalary()+employee.bonus()-employee.tax()));
    }
}
