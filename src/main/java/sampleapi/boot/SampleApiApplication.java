package sampleapi.boot;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("sampleapi.logic")
public class SampleApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleApiApplication.class, args);
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=0; i<n; i++){
		    for(int j=i;j<(n-2); j++){
		        
		        System.out.print(" ");
		    }
		    for(int k=0; k<=i; k++){
		        System.out.println("*");
		    }
		    
		}
	}

}
