@SignUp
Feature: Sign Up

 @SignUpSuccess
  Scenario Outline: Method POST resgister Successfully
    Given Set Sign Up method to POST-001
    When Set URL https://virtserver.swaggerhub.com/GERYSASTRAWAN123/DIGO/1.0.0/auth/signup
    And Set Sign Up body using Test Data-001 
    And Send Sign Up Request-001
    Then Show Sign Up the verify result 201 Created-001 
    
 @invalidMethod
  Scenario Outline: Method GET Sign Up Unsuccessfully
    Given Set Sign Up method to GET-002
    When Set URL https://virtserver.swaggerhub.com/GERYSASTRAWAN123/DIGO/1.0.0/auth/signup
    And Set Sign Up body using Test Data-002
    And Send Sign Up Request-002
    Then Show Sign Up the verify result 405 METHOD NOT ALLOWED-002

 @blankBody
  Scenario Outline: Method POST Sign Up Unsuccessfully
    Given Set Sign Up method to POST-003
    When Set URL https://virtserver.swaggerhub.com/GERYSASTRAWAN123/DIGO/1.0.0/auth/signup
    And Set Sign Up body using Test Data-003
    And Send Sign Up Request-003
    Then Show Sign Up the verify result 400 BAD REQUEST-003
    
  @sameUser
  Scenario Outline: Method POST Sign Up Unsuccessfully
    Given Set Sign Up method to POST-004
    When Set URL https://virtserver.swaggerhub.com/GERYSASTRAWAN123/DIGO/1.0.0/auth/signup
    And Set Sign Up body using Test Data-004
    And Send Sign Up Request-004
    Then Show Sign Up the verify result 400 BAD REQUEST-004
    
  @invalidSyntax 
  Scenario Outline: Method POST Sign Up Unsuccessfully
    Given Set Sign Up method to POST-005
    When Set URL https://virtserver.swaggerhub.com/GERYSASTRAWAN123/DIGO/1.0.0/auth/signup
    And Set Sign Up body using Test Data-005
    And Send Sign Up Request-005
    Then Show Sign Up the verify result 400 BAD REQUEST-005
 
 @wrongURL
  Scenario Outline: Method POST Sign Up Unsuccessfully
    Given Set Sign Up method to POST-006
    When Set URL https://virtserver.swaggerhub.com/GERYSASTRAWAN123/DIGO/1.0.0/auth/
    And Set Sign Up body using Test Data-006
    And Send Sign Up Request-006
    Then Show Sign Up the verify result 404 NOT FOUND-006

  @blankBodyAndWrongURL
  Scenario Outline: Method POST Sign Up Unsuccessfully
    Given Set Sign Up method to POST-003
    When Set URL https://virtserver.swaggerhub.com/GERYSASTRAWAN123/DIGO/1.0.0/auth/signup
    And Set Sign Up body using Test Data-003
    And Send Sign Up Request-003
    Then Show Sign Up the verify result 400 BAD REQUEST-003
    
  @blankURL
  Scenario Outline: Method POST Sign Up Unsuccessfully
    Given Set Sign Up method to POST-006
    When Set URL https://virtserver.swaggerhub.com/GERYSASTRAWAN123/DIGO/1.0.0/auth/
    And Set Sign Up body using Test Data-006
    And Send Sign Up Request-006
    Then Show Sign Up the verify result 400 BAD REQUEST-006   
 	