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

void MyListener::exitAssign(swlParser::AssignContext *ctx) {
    string name = ctx->ID(0)->getText();
    string val;
    if(ctx->ID().size() > 1) {
        val = ctx->ID(1)->getText();
    } else {
        val = ctx->NUMBER()->getText();
    }
    cout << string(indent, ' ') << "int " << name << " = " << val << ";" << endl;
}

void MyListener::exitInput(swlParser::InputContext *ctx) {
    string val;
    if (ctx->ID() != NULL) {
        val = ctx->ID()->getText();
    }
    cout << string(indent, ' ') << "cin >> " << val << ";" << endl;
}

void MyListener::exitPrint(swlParser::PrintContext *ctx) {
    string val;
    if(ctx->ID() != NULL) {
        val = ctx->ID()->getText();
    } else {
        val = ctx->NUMBER()->getText();
    }
    cout << string(indent, ' ') << "cout << " << val << " << endl;" << endl;    
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

void MyListener::enterWhileStatement(swlParser::WhileStatementContext *ctx) {
    cout << string(indent, ' ') << "while (";
}

void MyListener::exitWhileStatement(swlParser::WhileStatementContext *ctx) {
    indent -= indentIncrement;
    cout << string(indent, ' ') << "}" << endl;
}

void MyListener::exitDoPartialStatement(swlParser::DoPartialStatementContext *ctx) {
    cout << ") {" << endl;
    indent += indentIncrement;
}

void MyListener::exitAdd(swlParser::AddContext *ctx) {
    string name;
    string val;
    if(ctx->ID().size() > 1) {
        name = ctx->ID(1)->getText();
        val = ctx->ID(0)->getText();
    } else {
        name = ctx->ID(0)->getText();
        val = ctx->NUMBER()->getText();
    }
    cout << string(indent, ' ') << name << " += " << val << ';' << endl;
}

void MyListener::exitSub(swlParser::SubContext *ctx) {
    string name;
    string val;
    if(ctx->ID().size() > 1) {
        name = ctx->ID(1)->getText();
        val = ctx->ID(0)->getText();
    } else {
        name = ctx->ID(0)->getText();
        val = ctx->NUMBER()->getText();
    }
    cout << string(indent, ' ') << name << " -= " << val << ';' << endl;
}

void MyListener::exitMul(swlParser::MulContext *ctx) {
    string name;
    string val;
    if(ctx->ID().size() > 1) {
        name = ctx->ID(1)->getText();
        val = ctx->ID(0)->getText();
    } else {
        name = ctx->ID(0)->getText();
        val = ctx->NUMBER()->getText();
    }
    cout << string(indent, ' ') << name << " *= " << val << ';' << endl;
}

void MyListener::exitDiv(swlParser::DivContext *ctx) {
    string name;
    string val;
    if(ctx->ID().size() > 1) {
        name = ctx->ID(1)->getText();
        val = ctx->ID(0)->getText();
    } else {
        name = ctx->ID(0)->getText();
        val = ctx->NUMBER()->getText();
    }
    cout << string(indent, ' ') << name << " *= " << val << ';' << endl;
}