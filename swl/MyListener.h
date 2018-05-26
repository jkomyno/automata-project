#pragma once

#include "antlr4-runtime.h"
#include "swlParser.h"
#include "swlBaseListener.h"


/**
 * This class defines a concrete listener for a parse tree produced by swlParser.
 */
class  MyListener : public swlBaseListener {
private:
  int indent = 0;
  static const int indentIncrement = 4;

public:

  void enterProgram(swlParser::ProgramContext *ctx);
  void exitProgram(swlParser::ProgramContext *ctx);

  void exitAssign(swlParser::AssignContext *ctx);

  void exitInput(swlParser::InputContext *ctx);
  void exitPrint(swlParser::PrintContext *ctx);

  void enterBinaryLogicalOperator(swlParser::BinaryLogicalOperatorContext *ctx);
  void enterUnaryLogicalOperator(swlParser::UnaryLogicalOperatorContext *ctx);
  void enterComparisonOperator(swlParser::ComparisonOperatorContext *ctx);
  void enterExpression(swlParser::ExpressionContext *ctx);

  void enterWhileStatement(swlParser::WhileStatementContext *ctx);
  void exitWhileStatement(swlParser::WhileStatementContext *ctx);
  void exitDoPartialStatement(swlParser::DoPartialStatementContext *ctx);

  void exitAdd(swlParser::AddContext *ctx);
  void exitSub(swlParser::SubContext *ctx);
  void exitMul(swlParser::MulContext *ctx);
  void exitDiv(swlParser::DivContext *ctx);

};
