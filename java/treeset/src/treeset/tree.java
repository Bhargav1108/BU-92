package treeset;

import java.util.TreeSet;

public class tree {
	
	    public static void main(String[] args) {
	        TreeSet<String> tree=new TreeSet<>();
	        tree.add("Geeks");
	        tree.add("for");
	        tree.add("Geeks");
	        tree.add("GeeksforGeeks");
	        
	        for(String temp : tree){
	            System.out.println(temp+" ");
	            
	        }
	    }
	}

