// Generated from swl.g4 by ANTLR 4.7
#include <iostream>
#include "MyListener.h"

using namespace std;

void MyListener::enterProgram(swlParser::ProgramContext *ctx) {
    cout << "#include <iostream>" << endl << endl
         << "using namespace std;" << endl << endl
         << "int main() {" << endl;
    indent += indentIncrement;
}

void MyListener::exitProgram(swlParser::ProgramContext *ctx) {
    cout << "}" << endl;
}

void MyListener::exitDefine(swlParser::DefineContext *ctx) {
    string name = ctx->ID()->getText();
    string val;
    if (ctx->numberOrIdPartial()->ID()) {
        val = ctx->numberOrIdPartial()->ID()->getText();
    } else {
        val = ctx->numberOrIdPartial()->NUMBER()->getText();
    }
    cout << string(indent, ' ') << "int " << name << " = " << val << ";" << endl;
}

void MyListener::exitAssign(swlParser::AssignContext *ctx) {
    string name = ctx->ID()->getText();
    string val;
    if (ctx->numberOrIdPartial()->ID()) {
        val = ctx->numberOrIdPartial()->ID()->getText();
    } else {
        val = ctx->numberOrIdPartial()->NUMBER()->getText();
    }
    cout << string(indent, ' ') << name << " = " << val << ";" << endl;
}

void MyListener::exitInput(swlParser::InputContext *ctx) {
    string val;
    if (ctx->ID() != NULL) {
        val = ctx->ID()->getText();
    }
    cout << string(indent, ' ') << "cin >> " << val << ";" << endl;
}

void MyListener::exitPrint(swlParser::PrintContext *ctx) {
    cout << string(indent, ' ') << "cout << " << parsePrintArg(ctx);
    for (auto it : ctx->printVariadic()) {
        cout << " << " << parsePrintArg(it);
    }
    cout << " << " << "endl;" << endl;  
}

void MyListener::enterBinaryLogicalOperator(swlParser::BinaryLogicalOperatorContext *ctx) {
    if (ctx->AND() != NULL) {
        cout << " && ";
    } else if (ctx->OR() != NULL) {
        cout << " || ";
    }
}

void MyListener::enterUnaryLogicalOperator(swlParser::UnaryLogicalOperatorContext *ctx) {
    if (ctx->NOT() != NULL) {
        cout << '!';
    }
}

void MyListener::enterComparisonOperator(swlParser::ComparisonOperatorContext *ctx) {
    string op;
    if (ctx->EQUAL() != NULL) {
        op = "==";
    } else if (ctx->N_EQUAL() != NULL) {
        op = "!=";
    } else if (ctx->GT_EQUAL() != NULL) {
        op = ">=";
    } else if (ctx->LT_EQUAL() != NULL) {
        op = "<=";
    } else if (ctx->GT() != NULL) {
        op = ">";
    } else if (ctx->LT() != NULL) {
        op = "<";
    }
    cout << ' ' << op << ' ';
}

void MyListener::enterExpression(swlParser::ExpressionContext *ctx) {
    string val;

    if (ctx->BOOL() != NULL) {
        val = ctx->BOOL()->getText();
    } else if (ctx->ID() != NULL) {
        val = ctx->ID()->getText();
    } else if (ctx->NUMBER() != NULL) {
        val = ctx->NUMBER()->getText();
    }

    cout << val;    
}

void MyListener::enterConditionalExpression(swlParser::ConditionalExpressionContext *ctx) {
    cout << "(";
}

void MyListener::exitConditionalExpression(swlParser::ConditionalExpressionContext *ctx) {
    cout << ")";
}

void MyListener::enterWhileStatement(swlParser::WhileStatementContext *ctx) {
    cout << string(indent, ' ') << "while ";
}

void MyListener::exitWhileStatement(swlParser::WhileStatementContext *ctx) {
    indent -= indentIncrement;
    cout << string(indent, ' ') << "}" << endl;
}

void MyListener::exitDoPartialStatement(swlParser::DoPartialStatementContext *ctx) {
    cout << " {" << endl;
    indent += indentIncrement;
}

void MyListener::enterIfStatement(swlParser::IfStatementContext *ctx) {
    cout << string(indent, ' ') << "if ";
}

void MyListener::exitIfStatement(swlParser::IfStatementContext *ctx) {
    indent -= indentIncrement;
    cout << string(indent, ' ') << "}" << endl;
}

void MyListener::enterElseIfPartialStatement(swlParser::ElseIfPartialStatementContext *ctx) {
    indent -= indentIncrement;
    cout << string(indent, ' ') << "} else if ";
}

void MyListener::enterElsePartialStatement(swlParser::ElsePartialStatementContext *ctx) {
    indent -= indentIncrement;
    cout << string(indent, ' ') << "} else ";
}

void MyListener::exitElsePartialStatement(swlParser::ElsePartialStatementContext *ctx) {

}

string MyListener::parseForDeclarationAndReturnID(swlParser::ForDeclarationContext *ctx) {
    string idStr = ctx->ID()->getText();
    cout << string(indent, ' ') << "for (int " << idStr << " = ";
    return idStr;
}

void MyListener::parseRange(swlParser::RangeContext *ctx, const string& idStr) {
    string firstVal;
    string secondVal;
    int numbersCount = 0;
    if (ctx->numberOrIdPartial(0)->ID()) {
        firstVal = ctx->numberOrIdPartial(0)->ID()->getText();
    } else if (ctx->numberOrIdPartial(0)->NUMBER()) {
        firstVal = ctx->numberOrIdPartial(0)->NUMBER()->getText();
        numbersCount++;
    }
    if (ctx->numberOrIdPartial(1)->ID()) {
        secondVal = ctx->numberOrIdPartial(1)->ID()->getText();
    } else if (ctx->numberOrIdPartial(1)->NUMBER()) {
        secondVal = ctx->numberOrIdPartial(1)->NUMBER()->getText();
        numbersCount++;
    }

    bool lte = true; // <=
    if (numbersCount == 2) {
        int firstValN = stoi(firstVal);
        int secondValN = stoi(secondVal);
        
        if (firstValN > secondValN) {
            lte = false;
        }
    }

    string comparisonOp = lte ? "<=" : ">=";
    string incrementOp = lte ? "+=" : "-=";
    cout << firstVal << "; " << idStr << " " << comparisonOp << " " << secondVal << "; " << idStr << " " << incrementOp << " ";
    if (ctx->rangeIncrementPartial()) {
        cout << ctx->rangeIncrementPartial()->NUMBER()->getText();
    } else {
        cout << "1"; // default step
    }
    cout << ")";
}

void MyListener::enterForRangeStatement(swlParser::ForRangeStatementContext *ctx) {
    string idStr = parseForDeclarationAndReturnID(ctx->forDeclaration());
    parseRange(ctx->range(), idStr);
}

void MyListener::exitForRangeStatement(swlParser::ForRangeStatementContext *ctx) {
    indent -= indentIncrement;
    cout << string(indent, ' ') << "}" << endl;
}

void MyListener::enterOpenRoundBracket(swlParser::OpenRoundBracketContext *ctx) {
    cout << "(";
}

void MyListener::enterClosedRoundBracket(swlParser::ClosedRoundBracketContext *ctx) {
    cout << ")";
}

void MyListener::enterDeclare(swlParser::DeclareContext *ctx){
		string name = ctx->ID()->getText();
		cout << string(indent, ' ') << "int " << name << ';' << endl;
}

void MyListener::exitAdd(swlParser::AddContext *ctx) {
    parseMath(ctx, '+');
}

void MyListener::exitSub(swlParser::SubContext *ctx) {
    parseMath(ctx, '-');
}

void MyListener::exitMul(swlParser::MulContext *ctx) {
    parseMath(ctx, '*');
}

void MyListener::exitDiv(swlParser::DivContext *ctx) {
    parseMath(ctx, '/');
}
