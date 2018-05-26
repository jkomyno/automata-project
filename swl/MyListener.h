#pragma once

#include "antlr4-runtime.h"
#include "swlParser.h"
#include "swlParserBaseListener.h"


/**
 * This class defines a concrete listener for a parse tree produced by swlParser.
 */
class  MyListener : public swlParserBaseListener {
private:
  int indent = 0;
  static const int indentIncrement = 4;

public:

  void enterProgram(swlParser::ProgramContext *ctx);
  void exitProgram(swlParser::ProgramContext *ctx);

  void exitDefine(swlParser::DefineContext *ctx);
  void exitAssign(swlParser::AssignContext *ctx);

  void exitInput(swlParser::InputContext *ctx);
  void exitPrint(swlParser::PrintContext *ctx);

  void enterBinaryLogicalOperator(swlParser::BinaryLogicalOperatorContext *ctx);
  void enterUnaryLogicalOperator(swlParser::UnaryLogicalOperatorContext *ctx);
  void enterComparisonOperator(swlParser::ComparisonOperatorContext *ctx);
  void enterExpression(swlParser::ExpressionContext *ctx);
  void enterConditionalExpression(swlParser::ConditionalExpressionContext *ctx);
  void exitConditionalExpression(swlParser::ConditionalExpressionContext *ctx);

  void enterWhileStatement(swlParser::WhileStatementContext *ctx);
  void exitWhileStatement(swlParser::WhileStatementContext *ctx);
  void exitDoPartialStatement(swlParser::DoPartialStatementContext *ctx);
  void enterIfStatement(swlParser::IfStatementContext *ctx);
  void exitIfStatement(swlParser::IfStatementContext *ctx);
  void enterElseIfPartialStatement(swlParser::ElseIfPartialStatementContext *ctx);
  void enterElsePartialStatement(swlParser::ElsePartialStatementContext *ctx);
  void exitElsePartialStatement(swlParser::ElsePartialStatementContext *ctx);

  void enterOpenRoundBracket(swlParser::OpenRoundBracketContext *ctx);
  void enterClosedRoundBracket(swlParser::ClosedRoundBracketContext *ctx);

  void exitAdd(swlParser::AddContext *ctx);
  void exitSub(swlParser::SubContext *ctx);
  void exitMul(swlParser::MulContext *ctx);
  void exitDiv(swlParser::DivContext *ctx);

};
