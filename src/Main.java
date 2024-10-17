import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Adilet","Egemberdiev",LocalDate.of(2008,4,30));
        Person person2 = new Person("Fatima","Altynbek kyzy",LocalDate.of(2004,8,1));
        Person person3 = new Person("Mirlan","Tashtanbekov",LocalDate.of(1992,2,14));
        Person person4 = new Person("Gulnur","Asanalieva",LocalDate.of(1995,2,23));
        Person person5 = new Person("Bektur","Akylbekov",LocalDate.of(2004,3,3));
        Person person6 = new Person("Sanjar","Abdumalikov",LocalDate.of(2009,7,29));


        Person person7 = new Person("Mamyrgul","Zhursunbekova",LocalDate.of(2006,2,7));
        Person person8 = new Person("Said","Abdurashitov",LocalDate.of(2008,7,29));
        Person person9 = new Person("Enes","Marat uulu",LocalDate.of(2004,8,24));
        Person person10 = new Person("Nursultan","Alymbekov",LocalDate.of(2007,1,2));
        Person person11 = new Person("Elaman","Abjalov",LocalDate.of(2008,3,27));
        Person person12 = new Person("Rahmankul","Zhakaev",LocalDate.of(2003,4,14));
        Person person13 = new Person("Azmar","Kurmanbekov",LocalDate.of(2009,2,21));
        Person person14 = new Person("Jyrgalbek","Amangulov",LocalDate.of(2009,2,15));
        Person person15 = new Person("Jyrgalbek","Amangulov",LocalDate.of(2009,2,15));

        Person [] peopleJava ={person1,person2,person3,person4,person5,person6};

        Person [] peopleJs = {person7,person8,person9,person10,person11,person12,person13,person14};


        Group group1 = new Group(1,"Java 16",LocalDate.of(2024,9,9),"Aizat",peopleJava);
        Group group2 = new Group(2,"JS 16",LocalDate.of(2024,9,9),"Rabiya",peopleJs);

        Group [] groups ={group1,group2};

        for (Group group: groups) {
            if (group.id == 1){
                System.out.println(group.people.toString());
            }
        }

        Company company = new Company("Peaksoft","KG",LocalDate.of(2020,11,16),"Esen Niazov",groups);
        System.out.println(company);




    }
}