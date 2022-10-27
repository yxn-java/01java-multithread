package com.javapractice.designTypes.interpreter21;

interface Expression {
    public boolean evaluate(String context);
}

class IsInExpression implements Expression {
    private String data;

    public IsInExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean evaluate(String context) {
        if (context.contains(data)) {
            return true;
        }
        return false;
    }
}

class OrExpression implements Expression {

    private Expression expr1 = null;
    private Expression expr2 = null;

    public OrExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean evaluate(String context) {
        return expr1.evaluate(context) || expr2.evaluate(context);
    }
}

class AndExpression implements Expression {

    private Expression expr1 = null;
    private Expression expr2 = null;

    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean evaluate(String context) {
        return expr1.evaluate(context) && expr2.evaluate(context);
    }
}

public class Main {

    public static void main(String[] args) {
        Expression select = new IsInExpression("Select");
        Expression from = new IsInExpression("From");
        Expression isSelectFrom = new AndExpression(select, from);

        Expression insert = new IsInExpression("Insert");
        Expression update = new IsInExpression("Update");
        Expression isInsertOrUpdate = new OrExpression(insert, update);

        System.out.println(isSelectFrom.evaluate("Select"));
        System.out.println(isInsertOrUpdate.evaluate("Insert"));

        System.out.println(isSelectFrom.evaluate("Select From"));
        System.out.println(isInsertOrUpdate.evaluate("Update"));
    }
}

