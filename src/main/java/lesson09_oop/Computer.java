package lesson09_oop;

public class Computer {
    private String company;
    private int ram;
    private String cpu;
    private int sdd;

    public Computer() {   //new Computer()    null 0 null 0
    }

    public Computer(String company, int ram, String cpu, int sdd) {
        //this.company = company;
//        this.ram = ram;
//        this.cpu = cpu;
//        this.sdd = sdd;
        setCompany(company);
        setRam(ram);
        setCpu(cpu);
        setSdd(sdd);
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        if (company != null && !company.isBlank())
            this.company = company;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        if (ram > 0)
            this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        if (cpu != null && !cpu.isBlank())   //cpu.isBlank() == false
            this.cpu = cpu;
    }

    public int getSdd() {
        return sdd;
    }

    public void setSdd(int sdd) {
        if (sdd > 0)
            this.sdd = sdd;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "company='" + company + '\'' +
                ", ram=" + ram +
                ", cpu='" + cpu + '\'' +
                ", sdd=" + sdd +
                '}';
    }

    public void printComputer() {    //->
        System.out.println(company + "-->" + ram + ":" + cpu + ":" + sdd);
    }

    public Boolean isApple() {
        if(company == null)
            return false;
        if (company.equalsIgnoreCase("apple"))
            return true;
        else
            return false;
    }

    /*
    1. Create class Computer (constructors, getters, setters, toString)
             Computer
             -------
             company(String) "Lenovo"
             ram(int)        8 , 16
             cpu(String)     "i5 , i9"
             sdd(int)        512, 1024

2. Create class MainComputer - main
         create 5 objects Computer
         use setters and getter for printing
     */
}
