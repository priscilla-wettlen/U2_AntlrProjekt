package art;

import art.grammar.ArtBaseListener;
import art.grammar.ArtParser;


public class ArtCompiler extends ArtBaseListener {
    private StringBuilder out = new StringBuilder();

    /**
     * Label handlers
     * */
    private String enterForLoopLabel() {
        return "Label enterForLoop";
    }

    private String exitForLoopLabel() {
        return "Label exitForLoop";
    }

    /**
     * exitExpression method
     * */
    @Override public void exitExpr(ArtParser.ExprContext ctx) {
        if (ctx.INT() != null) {
            out.append("push ").append(ctx.INT().getText()).append("\n");
        }
    }


    /**
     * exitAssign method
     * */
    @Override public void exitAssign(ArtParser.AssignContext ctx) {
        out.append("pop ").append(ctx.ID().getText()).append("\n");
    }


    /**
     * exitAdd method
     * */
//    @Override public void exitAdd(ArtParser.AddContext ctx) {
//        out.append("push ").append(ctx.expr(0).getText()).append("\n"); //the first number to add, pos 0
//        out.append("push ").append(ctx.expr(1).getText()).append("\n"); //the second number to add pos 1
//        out.append("add\n");
//    }


    /**
     * exitPrint method
     * */
    @Override
    public void exitPrint(ArtParser.PrintContext ctx) {
        if (ctx.expr() != null) {
            out.append("push ").append(ctx.expr().getText()).append("\n");
        }

        out.append("print ").append(ctx.expr().getText()).append("\n");
    }

    /**
     * exitForLoop method
     * */
    @Override public void exitForLoop(ArtParser.ForLoopContext ctx) {
        String loopingVar = ctx.ID().getText();
        String startVar = ctx.range().expr(0).getText();
        String endVar = ctx.range().expr(1).getText();
        String loopStartLbl = enterForLoopLabel();
        String loopEndLbl = exitForLoopLabel();

        out.append("// for ").append(loopingVar).append(" in collection from ").append(startVar).append(" to ").append(endVar).append("\n");
        out.append(loopingVar).append(" = ").append(startVar).append(";\n");
        out.append(loopStartLbl).append(":\n");
        out.append("if ").append(loopingVar).append(" > ").append(endVar).append(" goto ").append(loopEndLbl).append(";\n");
        out.append(loopingVar).append(" = ").append(loopingVar).append(" + 1;\n");
        out.append("goto ").append(loopStartLbl).append(";\n");
        out.append(loopEndLbl).append(":\n");
    }


    public String getCompiledCode() {
            return out.toString();
        }

}

