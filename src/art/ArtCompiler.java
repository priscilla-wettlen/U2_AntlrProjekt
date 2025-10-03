package art;

import art.grammar.ArtBaseListener;
import art.grammar.ArtParser;


public class ArtCompiler extends ArtBaseListener {
    private StringBuilder out = new StringBuilder();
//    private String startLoopLabel = newLabel();
//    private String endLoopLabel = newLabel();
//    private int labelCount = 0;
//
//    private String newLabel() {
//        return "label" + (labelCount++);
//    }

//    @Override public void enterCode(ArtParser.CodeContext ctx) {
//        out.append("Entering code\n");
//    }
//
//    @Override public void exitCode(ArtParser.CodeContext ctx) {
//        out.append("Exiting code");
//    }

    @Override public void exitAssign(ArtParser.AssignContext ctx) {
        out.append("pop ").append(ctx.ID().getText()).append("\n");
    }
    @Override public void exitExpr(ArtParser.ExprContext ctx) {
        if (ctx.INT() != null) {
            out.append("push ").append(ctx.INT().getText()).append("\n");
        }

    }

    @Override public void exitAddition(ArtParser.AdditionContext ctx) {
        out.append("push ").append(ctx.expr(0).getText()).append("\n"); //the first number to add, pos 0
        out.append("push ").append(ctx.expr(1).getText()).append("\n"); //the second number to add pos 1

        out.append("add\n");
    }

//    @Override
//    public void exitPrint(ArtParser.PrintContext ctx) {
//        out.append("print\n");
//    }
//    @Override public void enterForloop(ArtParser.ForloopContext ctx) {
//        out.append(";; for loop init\n");
//        out.append("push ");
//        out.append("pop ").append(ctx.ID().getText()).append("\n");
//
//        out.append(startLoopLabel).append(":\n");
//
//        out.append("push ").append(ctx.ID().getText()).append("\n");
//        out.append("lt").append("\n");
//        out.append("jz ").append(endLoopLabel).append("\n");
//    }
//
//    @Override public void exitForloop(ArtParser.ForloopContext ctx) {
//        out.append("push ").append(ctx.ID().getText()).append("\n");
//        out.append("push 1\n");
//        out.append("add\n");
//        out.append("pop ").append(ctx.ID().getText()).append("\n");
//
//        out.append("goto ").append(ctx.start).append("\n");
//
//        out.append(endLoopLabel).append(":\n");
//
//
//    }

    @Override
    public void exitPrint(ArtParser.PrintContext ctx) {
        if (ctx.expr() != null) {
            out.append("push ").append(ctx.expr().getText()).append("\n");
        }

        out.append("print\n");
    }

        public String getCompiledCode() {
            return out.toString();
        }
}

