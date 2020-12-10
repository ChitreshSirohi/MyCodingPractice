package com.leet.Solution.JulyChallenge;

import java.util.*;
import java.util.stream.Collectors;

public class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        List<Task> taskArrayList = new ArrayList<>();
        for (char t:tasks) {
            final Optional<Task> any = taskArrayList.stream().filter(task -> task.getCharI() == t).findAny();
            if(any.isPresent()){
                final Task tempTask = any.get();
                tempTask.setCount(tempTask.getCount()+1);
            }else {
                taskArrayList.add(new Task(t));
            }

        }
        Comparator<Task> comparator = (o1, o2) -> {
            if(o1.getCount() > o2.getCount()){
                return -1;
            }else if (o1.getCount() == o2.getCount()){
                return 0;
            }
            return 1;
        };
        int second=0;
        boolean wait=false;
        taskArrayList.sort(comparator);
        while (!taskArrayList.isEmpty()){
            for(int ctr=0;ctr<n+1;ctr++){
                if(taskArrayList.size() > ctr){
                    Task temp = taskArrayList.get(ctr);
                    if(temp.getCount() > 0){
                       temp.setCount(temp.getCount() - 1);
                        second++;
                        wait=false;
                        if(temp.getCount() == 0 && taskArrayList.stream().noneMatch(task -> task.getCount() > 0)){
                            break;
                        }
                    }
                }else {
                    second++;
                    wait=true;
                }
            }
            taskArrayList = taskArrayList.stream().filter(task -> task.getCount() > 0).collect(Collectors.toList());
            taskArrayList.sort(comparator);
        }

        return wait?second-1:second;
    }

    public static class Task{
        char charI;
        int count;

        public Task(final char charI) {
            this.charI = charI;
            this.count=1;
        }

        public char getCharI() {
            return this.charI;
        }

        public int getCount() {
            return this.count;
        }

        public void setCount(final int count) {
            this.count = count;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            final Task task = (Task) o;
            return this.charI == task.charI;
        }

        @Override
        public int hashCode() {
            return Objects.hash(this.charI);
        }
    }
}
