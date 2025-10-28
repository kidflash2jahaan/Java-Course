package com.systemerr.javacourse.arraylistchallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Available actions:\n0 - to shutdown\n1 - to add item(s) to list (comma delimited list)\n2 - to remove any items (comma delimited list)\nEnter a number for which action you want to do: ");
            int action = Integer.parseInt(scanner.nextLine());

            if (action != 1 && action != 2) {
                System.out.println("Shutting down...");
                break;
            }

            System.out.print("Enter a comma delimited list: ");
            List<String> userList = Arrays.asList(scanner.nextLine().split(","));

            for (int i = 0; i < userList.size(); i++) {
                String userItem = userList.get(i);
                if (action == 1) {
                    if (!list.contains(userItem)) {
                        list.add(userItem);
                    }
                } else {
                    if (list.contains(userItem)) {
                        list.remove(userItem);
                    }
                }
            }

            System.out.println(list);
        }
        scanner.close();
    }
}
