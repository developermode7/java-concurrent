package com.developermode.test;

import com.developermode.concurrent.Task;
import com.developermode.util.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceTest
{
    public static void main(String[] args) throws  InterruptedException, ExecutionException
    {
        //create multiple tasks
        Task task1 = new Task("DA1","delhi","mumbai");
        Task task2 = new Task("a21", "hyderabad" ,"Pune");
        Task task3 = new Task("wa1","Kochi","Chennai");

        List<Task> listOfTasks = new ArrayList<Task>();
        listOfTasks.add(task1);
        listOfTasks.add(task2);
        listOfTasks.add(task3);


        //create 5 thread pools using ExecutorService and invoke all tasks
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        List<Future<Order>> orderFutureList = executorService.invokeAll(listOfTasks);

        //get the order from futurelist
        for(int i=0;i<orderFutureList.size();i++)
        {
            Future<Order> future = orderFutureList.get(i);
            Order order = future.get();
        }

        executorService.shutdown();


    }

}
