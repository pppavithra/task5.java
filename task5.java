question 1:
code:
package com.task5.question1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class UppercaseString {

	public static void main(String[] args) {
		List<String> alpha = Arrays.asList("raju","levin","baratH");

		System.out.println(alpha);

// Java 8,using stream()to map to convert uppercase and collect that list
        List<String> collect = alpha.stream()
        		.map(String::toUpperCase)
        		.collect(Collectors.toList());
        System.out.println(collect); 

	}
        }
Output:
[raju, levin, baratH]
[RAJU, LEVIN, BARATH]

questionn 2:
code:
package com.task5.question2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Nonemptystring {
   public static void main(String[] args) {
		
// Create an ArrayList of strings
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("");
        stringList.add("World");
        stringList.add("");
        stringList.add("Java");
        stringList.add("");

// Filter and print non-empty strings
        List<String> nonEmptyStrings = stringList.stream()
                .filter(s -> !s.isEmpty()) // Filter out empty strings
                .collect(Collectors.toList());

        System.out.println("Non-empty strings:");
        nonEmptyStrings.forEach(System.out::println);
    }
}
Output:
Non-empty strings:
Hello
World
Java

question 3:
code:
package com.task5.question3;

import java.util.Arrays;
import java.util.List;

public class Studentcharfilter {
        public static void main(String[] args) {
        
        List<String> stringList = Arrays.asList("Hello","Abi","World","Anbu","Anu","sevatha");
// Use stream to filter  strings are startswith 'A'
        long count = stringList.stream() 
              .filter(x -> x.startsWith("A")) 
	      .count();
       System.out.printf("List %s has %d strings which startsWith 'A' %n", stringList, count);
}
}
Output:
List [Hello, Abi, World, Anbu, Anu, sevatha] has 3 strings which startsWith 'A' 

question 4:
code:
package com.task5.question4;

import java.util.Date;
import java.time.Month;
import java.time.Period;
import java.time.LocalDate;

public class Gfg {
	public static void main (String[] args) {
//Localdate to input the birthday date		
        LocalDate birthdate= LocalDate.of(1998, 9, 3);
//use currentdate get today days
        LocalDate currentDate = LocalDate.now();
        System.out.println("------Output:");
        System.out.println("\n your Age is....");
	int age = calculateAge(birthdate, currentDate);
	System.out.println(age+"\nyears");
	int month = calculatemonth(birthdate, currentDate);
	System.out.println(month+"\nmonth");
	int days = calculatedays(birthdate, currentDate);
	System.out.println(days+"\nday");
        }
//year,day,month to getmethod()
	private static int calculatedays(LocalDate birthdate, LocalDate currentDate) {
		Period period = Period.between(birthdate, currentDate);
		return period.getDays();
	}

        private static int calculatemonth(LocalDate birthdate, LocalDate currentDate) {
		Period period = Period.between(birthdate, currentDate);
		return period.getMonths();
	}

	private static int calculateAge(LocalDate birthdate, LocalDate currentDate) {
		Period period = Period.between(birthdate, currentDate);
		
		return period.getYears();
	}
	}
output:
------Output:

 your Age is....
25
years
6
month
12
day






