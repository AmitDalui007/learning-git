interface company{
    public String cname="ABC";
    }
    class employee1{
    String ename,ebdate;
    int esalary;
    employee1(String ename,String ebdate,int esalary){
    this.ename=ename;
    this.ebdate=ebdate;
    this.esalary=esalary;
    }
    void display()
    {
    System.out.println("Employee name:"+ename);
    System.out.println("Employee dob:"+ebdate);
    System.out.println("Employee salary:"+esalary);
    }
    }
    class eng extends employee1 implements company
    {
    eng(String s,String s1,int i)
    {
    super(s,s1,i);
    }
    void display()
    {
    super.display();
    System.out.println("company name:"+cname);
    }
    }
    class secratory extends employee1 implements company
    {
    secratory(String s,String s1,int i)
    {
    super(s,s1,i);
    }
    void display()
    {
    super.display();
    System.out.println("company name:"+cname);
    }
    }
    class manager extends employee1 implements company
    {
    manager(String s,String s1,int i)
    {
    super(s,s1,i);
    }
    void display()
    {
    super.display();
    System.out.println("company name:"+cname);
    }
    }
    class director extends manager
    {
    double cloan;
    
    director(String s,String s1,int i,double cloan)
    {
    super(s,s1,i);
    this.cloan=cloan;
    }
    void display()
    {
    super.display();
    System.out.println("carloan amount:"+cloan);
    }
    }
    class employee{
    public static void main(String args[]){
    System.out.println("employee information");
    eng e=new eng("mr. x","19.07.1998",40000);
    e.display();
    secratory e1=new secratory("mr. y","12.06.1980",50000);
    e1.display();
    manager e2=new manager("mr. z","17.07.1985",60000);
    e2.display();
    director e3=new director("mr, hide","19.07.2001",80000,50000);
    e3.display();
    }}
    