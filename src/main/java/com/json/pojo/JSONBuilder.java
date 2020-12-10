package com.json.pojo;

import com.google.gson.Gson;

import java.util.ArrayList;

public class JSONBuilder {
    public static void main(String[] args) {
        Gson gson = new Gson();
        final String s = gson.toJson(createReport());
        System.out.println(s);

    }

    private static Error createError(){
        final Error error = new Error();
        error.setCode("1");
        error.setDescription("Des");
        error.setExplanation("Expl");
        return error;
    }

    private static Report createReport(){
        Report report = new Report();
        final ArrayList<Error> errors = new ArrayList<>();
        errors.add(createError());
        report.setErrors(errors);
        return report;
    }
}
