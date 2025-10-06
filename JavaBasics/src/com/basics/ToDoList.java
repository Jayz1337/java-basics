package com.testjava;
import java.util.ArrayList;
import java.util.Scanner;
public class ToDoList {
	
	public static void main(String[] args) {
		ArrayList<String> myTasks = TasksList();
		while(true) {
			boolean KeepRunning = menu(myTasks);
			if(KeepRunning == false) {
				System.out.println("Closing..");
				break;
			}
		}
		
		
	}
	public static boolean menu(ArrayList<String> MyTaskList) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		System.out.println("1.Add Task\n2.Remove Task\n3.View Tasks\n4.Close program");
		choice = scanner.nextInt();
		scanner.nextLine();
		switch (choice) {
			case 1:
				addTask(MyTaskList);
				break;
			case 2:
				removeTask(MyTaskList);
				break;
			case 3:
				printList(MyTaskList);
				break;
			case 4:
				return false;
			default:
				System.out.println("Invalid choice!");
			
		}
		return true;
	}
	public static ArrayList<String> TasksList(){
		ArrayList<String> tasks = new ArrayList<>();
		return tasks;
	}
	public static ArrayList<String> addTask(ArrayList<String> taskList){
		Scanner scanner = new Scanner(System.in);
		String item = scanner.nextLine();
		taskList.add(item);
		return taskList;
	}
	public static ArrayList<String> removeTask(ArrayList<String> taskList){
		Scanner scanner = new Scanner(System.in);
		String r_item = scanner.nextLine();
		if(taskList.contains(r_item)){
			taskList.remove(r_item);
		} else {
			System.out.println("Task not found");
		}
		return taskList;
	}
	public static void printList(ArrayList<String> taskList){
		if(taskList.isEmpty()) {
			System.out.println("List is empty!");
			System.out.println("------------");
		}else {
			
			System.out.println("TASKS!");
			for (int i = 0 ; i < taskList.size(); i++) {
				
				
				System.out.println((i+1)+"."+taskList.get(i));
				System.out.println("------------");
			}
		}
	}
	

}
