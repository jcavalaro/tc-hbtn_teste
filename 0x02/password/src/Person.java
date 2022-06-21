import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class Person {
    private String name;
    private String surname;
    private Date birthDate;
    private boolean anotherCompanyOwner, pensioner, publicServer;
    private float salary;

    public Person(){}

    private String username;
    private String password;

    public Person(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean checkUser(String username){
        return username.matches("[0-9a-zA-Z]{8,}$");
    }




    public boolean checkPassword(String password){
        return password.matches("(?=.*[A-Z])(?=.*[0-9])(?=.*[$*&@#])[0-9a-zA-Z$*&@#]{8,}$");
                /*
                Deve possuir pelo menos 1 letra maiúscula
                Deve possuir pelo menos 1 número
                Deve possuir pelo menos 1 caractere especial
                Ter no mínimo 8 caracteres
                 */
    }

    public String fullName(){
        return String.format("%s %s", getName() , getSurname());
    }

    public float calculateYearlySalary(){
        return getSalary() * 12;
    }

    public static int calculateAge(Date bDate) {
        LocalDate date = bDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate currentDate = LocalDate.now();

        return Period.between(date, currentDate).getYears();
    }

    public boolean isMEI(){
        //Calendar today = Calendar.getInstance();
        //int age = LocalDate.now().getYear() - birthDate.getYear();
        //age = today.get(Calendar.YEAR) - birthDate.getYear();
        //Period age = Period.between(birthDate, LocalDate.now());


        if(calculateYearlySalary() < 130000 && calculateAge(getBirthDate()) >= 18 && isAnotherCompanyOwner() == false && isPensioner() == false && isPublicServer() == false){
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date bithDate) {
        this.birthDate = bithDate;
    }

    public boolean isAnotherCompanyOwner() {
        return anotherCompanyOwner;
    }

    public void setAnotherCompanyOwner(boolean anotherCompanyOwner) {
        this.anotherCompanyOwner = anotherCompanyOwner;
    }

    public boolean isPensioner() {
        return pensioner;
    }

    public void setPensioner(boolean pensioner) {
        this.pensioner = pensioner;
    }

    public boolean isPublicServer() {
        return publicServer;
    }

    public void setPublicServer(boolean publicServer) {
        this.publicServer = publicServer;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Person(String name, String surname, Date birthDate, boolean anotherCompanyOwner, boolean pensioner, boolean publicServer) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.anotherCompanyOwner = anotherCompanyOwner;
        this.pensioner = pensioner;
        this.publicServer = publicServer;

    }
}
