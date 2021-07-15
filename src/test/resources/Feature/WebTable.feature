Feature: Webtable
  I want to add member to Webtable element

  @TC_EL_WT_01
  Scenario: Verify that data display correct in Grid Member
    Given Open home page
    Then The website display Default Member in Grid correct
      | firstName | lastName | age | email              | salary | department |
      | Cierra    | Vega     | 39  | cierra@example.com | 10000  | Insurance  |

  @TC_EL_WT_02
  Scenario: Verify that open Registration Form success when user click on add button
    Given Open home page
    When Click on add button
    Then The website display Registration Form correct
      | formName          |
      | Registration Form |


  @TC_EL_WT_03
  Scenario: Verify on entering data to all textfield
    Given Open home page
    When Click on add button
    And Enter data to all textfield
      | firstName | lastName | email               | age | salary  | department  |
      | Phuong    | Hong     | phuong123@gmail.com | 18  | 2000000 | Tester Team |
    And Click submit button
    Then The website display Member in Grid correct
      | firstName | lastName | age | email               | salary  | department  |
      | Phuong    | Hong     | 18  | phuong123@gmail.com | 2000000 | Tester Team |


  @TC_EL_WT_04
  Scenario: Verify on entering data to email textfield
    Given Open home page
    When Click on add button
    And Enter data to all textfield
      | firstName | lastName | email  | age | salary  | department  |
      | Phuong    | Hong     | phuong | 18  | 2000000 | Tester Team |
    And Click submit button
    Then The website display warning at email textfield

  @TC_EL_WT_05
  Scenario: Verify on entering data to age textfield
    Given Open home page
    When Click on add button
    And Enter data to all textfield
      | firstName | lastName | email               | age | salary  | department  |
      | Phuong    | Hong     | phuong123@gmail.com | ag  | 2000000 | Tester Team |
    And Click submit button
    Then The website display warning at age textfield

  @TC_EL_WT_06
  Scenario: Verify on entering data to salary textfield
    Given Open home page
    When Click on add button
    And Enter data to all textfield
      | firstName | lastName | email               | age | salary | department  |
      | Phuong    | Hong     | phuong123@gmail.com | 18  | abcd   | Tester Team |
    And Click submit button
    Then The website display warning at salary textfield

  @TC_EL_WT_07
  Scenario: Verify on all textfields are blank
    Given Open home page
    When Click on add button
    And Click submit button
    Then The website display warning at all textfields

  @TC_EL_WT_08
  Scenario: Verify on updating data to all textfield
    Given Open home page
    When Click on edit icon button
    And Update data to all textfields
      | firstName | lastName | email            | age | salary | department  |
      | Sun       | Team     | Sun123@gmail.com | 18  | 100000 | Tester Team |
    And Click submit button
    Then The website display Member Updated in Grid correct
      | firstName | lastName | age | email            | salary | department  |
      | Sun       | Team     | 18  | Sun123@gmail.com | 100000 | Tester Team |

  @TC_EL_WT_09
  Scenario: Verify on updating data to email textfield
    Given Open home page
    When Click on edit icon button
    And Update data to all textfields
      | firstName | lastName | email  | age | salary | department  |
      | Sun       | Team     | Sun123 | 18  | 100000 | Tester Team |
    And Click submit button
    Then The website display warning at email textfield

  @TC_EL_WT_10
  Scenario: Verify on updating data to age textfield
    Given Open home page
    When Click on edit icon button
    And Update data to all textfields
      | firstName | lastName | email            | age | salary | department  |
      | Sun       | Team     | Sun123@gmail.com | hi  | 100000 | Tester Team |
    And Click submit button
    Then The website display warning at age textfield

  @TC_EL_WT_11
  Scenario: Verify on updating to salary textfield
    Given Open home page
    When Click on edit icon button
    And Update data to all textfields
      | firstName | lastName | email            | age | salary | department  |
      | Sun       | Team     | Sun123@gmail.com | 18  | hello  | Tester Team |
    And Click submit button
    Then The website display warning at salary textfield

  @TC_EL_WT_12
  Scenario: Verify on click delete icon
    Given Open home page
    When Click on delete icon at any record
    Then The website display Member in Grid except record deleted
