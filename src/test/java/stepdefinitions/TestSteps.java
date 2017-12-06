package stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.By;
import pageobjects.globalmasters.*;
import pageobjects.transactionreport.*;

import static webdriver.AppDriver.driver;

public class TestSteps {
//define mother tongue
    @When("^user open define mother tongue page$")
    public void user_open_define_mother_tongue_page() throws Throwable {
        new DefineMotherTongue(driver).openDefineMotherTongue();
    }

    @When("^click save on define mother tongue page$")
    public void click_save_on_define_mother_tongue_page() throws Throwable {
        new DefineMotherTongue(driver).clickSave();
    }

    @Then("^verify blank field on define mother tongue page$")
    public void verify_blank_field_on_define_mother_tongue_page() throws Throwable {
        new DefineMotherTongue(driver).validateBlank();
    }

    @When("^enter mother tongue as \"([^\"]*)\"$")
    public void enter_mother_tongue_as(String arg1) throws Throwable {
        new DefineMotherTongue(driver).enterMotherTongue(arg1);
    }

    @When("^enter \"([^\"]*)\" characters in mother tongue$")
    public void enter_characters_in_mother_tongue(int arg1) throws Throwable {
        new DefineMotherTongue(driver).enterMotherTongue(arg1);
    }

    @Then("^verify numeric data on define mother tongue page$")
    public void verify_numeric_data_on_define_mother_tongue_page() throws Throwable {
        new DefineMotherTongue(driver).validateNumericValue();
    }

    @Then("^verify alphanumeric data on define mother tongue page$")
    public void verify_alphanumeric_data_on_define_mother_tongue_page() throws Throwable {
        new DefineMotherTongue(driver).validateNumericValue();
    }

    @Then("^verify character length on define mother tongue page$")
    public void verify_character_length_on_define_mother_tongue_page() throws Throwable {
        new DefineMotherTongue(driver).validateLength();
    }

    @Then("^verify duplicate value on define mother tongue page$")
    public void verify_duplicate_value_on_define_mother_tongue_page() throws Throwable {
        new DefineMotherTongue(driver).verifyDuplicateValue();
        new DefineMotherTongue(driver).verifyWarningMessageImage();
    }

    @Then("^verify save message on define mother tongue page$")
    public void verify_save_message_on_define_mother_tongue_page() throws Throwable {
        new DefineMotherTongue(driver).verifySaveMessage();
        new DefineMotherTongue(driver).verifySuccessMessageImage();
    }

    @When("^click cancel on define mother tongue page$")
    public void click_cancel_on_define_mother_tongue_page() throws Throwable {
        new DefineMotherTongue(driver).clickCancel();
    }

    @Then("^verify cancel on define mother tongue page$")
    public void verify_cancel_on_define_mother_tongue_page() throws Throwable {
        new DefineMotherTongue(driver).verifyCancel();
    }

    @When("^select record on define mother tongue page$")
    public void select_record_on_define_mother_tongue_page() throws Throwable {
        new DefineMotherTongue(driver).clickView();
        new DefineMotherTongue(driver).selectRecord();
    }

    @When("^delete record on define mother tongue page$")
    public void delete_record_on_define_mother_tongue_page() throws Throwable {
        new DefineMotherTongue(driver).clickDelete();
        new DefineMotherTongue(driver).clickYes();
    }

    @Then("^verify delete message on define mother tongue page$")
    public void verify_delete_message_on_define_mother_tongue_page() throws Throwable {
        new DefineMotherTongue(driver).verifyDeleteMessage();
        new DefineMotherTongue(driver).verifySuccessMessageImage();
    }

    @When("^modify record on define mother tongue page$")
    public void modify_record_on_define_mother_tongue_page() throws Throwable {
        new DefineMotherTongue(driver).clickModify();
        new DefineMotherTongue(driver).clickYes();
    }

    @Then("^verify modify message on define mother tongue page$")
    public void verify_modify_message_on_define_mother_tongue_page() throws Throwable {
        new DefineMotherTongue(driver).verifyModifyMessage();
        new DefineMotherTongue(driver).verifySuccessMessageImage();
    }

    @Then("^verify the saved value on define mother tongue page$")
    public void verify_the_saved_value_on_define_mother_tongue_page() throws Throwable {
        new DefineMotherTongue(driver).clickView();
        new DefineMotherTongue(driver).verifyCharactersSaved();
    }

//define language
    @When("^user open define language page$")
    public void user_open_define_language_page() throws Throwable {
       new DefineLanguage(driver).openDefineLanguage();
    }

    @When("^click save on define language page$")
    public void click_save_on_define_language_page() throws Throwable {
       new DefineLanguage(driver).clickSave();
    }

    @Then("^verify blank field on define language page$")
    public void verify_blank_field_on_define_language_page() throws Throwable {
        new DefineLanguage(driver).validateBlank();
    }

    @When("^enter language as \"([^\"]*)\"$")
    public void enter_language_as(String arg1) throws Throwable {
        new DefineLanguage(driver).enterLanguageName(arg1);
    }

    @Then("^verify numeric data on define language page$")
    public void verify_numeric_data_on_define_language_page() throws Throwable {
        new DefineLanguage(driver).validateNumericValue();
    }

    @Then("^verify alphanumeric data on define language page$")
    public void verify_alphanumeric_data_on_define_language_page() throws Throwable {
        new DefineLanguage(driver).validateNumericValue();
    }

    @When("^enter \"([^\"]*)\" characters in language$")
    public void enter_characters_in_language(int arg1) throws Throwable {
        new DefineLanguage(driver).enterLanguageName(arg1);
    }

    @Then("^verify language length on define language page$")
    public void verify_language_length_on_define_language_page() throws Throwable {
        new DefineLanguage(driver).validateLength();
    }

    @Then("^verify duplicate value on define language page$")
    public void verify_duplicate_value_on_define_language_page() throws Throwable {
        new DefineLanguage(driver).verifyDuplicateValue();
        new DefineLanguage(driver).verifyWarningMessageImage();
    }

    @Then("^verify save message on define language page$")
    public void verify_save_message_on_define_language_page() throws Throwable {
        new DefineLanguage(driver).verifySaveMessage();
        new DefineLanguage(driver).verifySuccessMessageImage();
    }

    @When("^click cancel on define language page$")
    public void click_cancel_on_define_language_page() throws Throwable {
        new DefineLanguage(driver).clickCancel();
    }

    @Then("^verify cancel on define language page$")
    public void verify_cancel_on_define_language_page() throws Throwable {
        new DefineLanguage(driver).verifyCancel();
    }

    @When("^select record on define language page$")
    public void select_record_on_define_language_page() throws Throwable {
        new DefineLanguage(driver).clickView();
        new DefineLanguage(driver).selectRecord();
    }

    @When("^delete record on define language page$")
    public void delete_record_on_define_language_page() throws Throwable {
        new DefineLanguage(driver).clickDelete();
        new DefineLanguage(driver).clickYes();
    }

    @Then("^verify delete message on define language page$")
    public void verify_delete_message_on_define_language_page() throws Throwable {
        new DefineLanguage(driver).verifyDeleteMessage();
        new DefineLanguage(driver).verifySuccessMessageImage();
    }

    @When("^modify record on define language page$")
    public void modify_record_on_define_language_page() throws Throwable {
        new DefineLanguage(driver).clickModify();
        new DefineLanguage(driver).clickYes();
    }

    @Then("^verify modify message on define language page$")
    public void verify_modify_message_on_define_language_page() throws Throwable {
        new DefineLanguage(driver).verifyModifyMessage();
        new DefineLanguage(driver).verifySuccessMessageImage();
    }

//define moral
    @When("^user open define moral page$")
    public void user_open_define_moral_page() throws Throwable {
       new DefineMoral(driver).openDefineMoral();
    }

    @When("^click save on define moral page$")
    public void click_save_on_define_moral_page() throws Throwable {
        new DefineMoral(driver).clickSave();
    }

    @Then("^verify blank field on define moral page$")
    public void verify_blank_field_on_define_moral_page() throws Throwable {
        new DefineMoral(driver).validateBlank();
    }

    @When("^enter moral as \"([^\"]*)\"$")
    public void enter_moral_as(String arg1) throws Throwable {
       new DefineMoral(driver).enterMoralName(arg1);
    }

    @Then("^verify numeric data on define moral page$")
    public void verify_numeric_data_on_define_moral_page() throws Throwable {
       new DefineMoral(driver).validateNumericValue();
    }

    @Then("^verify alphanumeric data on define moral page$")
    public void verify_alphanumeric_data_on_define_moral_page() throws Throwable {
        new DefineMoral(driver).validateNumericValue();
    }

    @When("^enter \"([^\"]*)\" characters in moral$")
    public void enter_characters_in_moral(int arg1) throws Throwable {
       new DefineMoral(driver).enterMoralName(arg1);
    }

    @Then("^verify character length on define moral page$")
    public void verify_character_length_on_define_moral_page() throws Throwable {
        new DefineMoral(driver).validateLength();
    }

    @Then("^verify duplicate value on define moral page$")
    public void verify_duplicate_value_on_define_moral_page() throws Throwable {
        new DefineMoral(driver).verifyDuplicateValue();
        new DefineMoral(driver).verifyWarningMessageImage();
    }

    @Then("^verify save message on define moral page$")
    public void verify_save_message_on_define_moral_page() throws Throwable {
        new DefineMoral(driver).verifySaveMessage();
        new DefineMoral(driver).verifySuccessMessageImage();
    }

    @When("^click cancel on define moral page$")
    public void click_cancel_on_define_moral_page() throws Throwable {
        new DefineMoral(driver).clickCancel();
    }

    @Then("^verify cancel on define moral page$")
    public void verify_cancel_on_define_moral_page() throws Throwable {
        new DefineMoral(driver).verifyCancel();
    }

    @When("^select record on define moral page$")
    public void select_record_on_define_moral_page() throws Throwable {
        new DefineMoral(driver).clickView();
        new DefineMoral(driver).selectRecord();
    }

    @When("^delete record on define moral page$")
    public void delete_record_on_define_moral_page() throws Throwable {
       new DefineMoral(driver).clickDelete();
       new DefineMoral(driver).clickYes();
    }

    @Then("^verify delete message on define moral page$")
    public void verify_delete_message_on_define_moral_page() throws Throwable {
       new DefineMoral(driver).verifyDeleteMessage();
       new DefineMoral(driver).verifySuccessMessageImage();
    }

    @When("^modify record on define moral page$")
    public void modify_record_on_define_moral_page() throws Throwable {
      new DefineMoral(driver).clickModify();
      new DefineMoral(driver).clickYes();
    }

    @Then("^verify modify message on define moral page$")
    public void verify_modify_message_on_define_moral_page() throws Throwable {
        new DefineMoral(driver).verifyModifyMessage();
        new DefineMoral(driver).verifySuccessMessageImage();
    }

//term master
    @When("^user open define term master page$")
    public void user_open_define_term_master_page() throws Throwable {
        new TermMaster(driver).openTermMaster();
    }

    @When("^click save on define term master page$")
    public void click_save_on_define_term_master_page() throws Throwable {
       new TermMaster(driver).clickSave();
    }

    @Then("^verify blank field on define term master page$")
    public void verify_blank_field_on_define_term_master_page() throws Throwable {
       new TermMaster(driver).validateBlank();
    }

    @When("^enter term master as \"([^\"]*)\"$")
    public void enter_term_master_as(String arg1) throws Throwable {
        new TermMaster(driver).enterTermName(arg1);
    }

    @Then("^verify save message on define term master page$")
    public void verify_save_message_on_define_term_master_page() throws Throwable {
        new TermMaster(driver).verifySaveMessage();
        new TermMaster(driver).verifySuccessMessageImage();
    }

    @When("^enter \"([^\"]*)\" characters in term master$")
    public void enter_characters_in_term_master(int arg1) throws Throwable {
       new TermMaster(driver).enterTermName(arg1);
    }

    @Then("^verify character length on define term master page$")
    public void verify_character_length_on_define_term_master_page() throws Throwable {
       new TermMaster(driver).validateLength();
    }

    @Then("^verify duplicate value on define term master page$")
    public void verify_duplicate_value_on_define_term_master_page() throws Throwable {
       new TermMaster(driver).verifyDuplicateValue();
       new TermMaster(driver).verifyWarningMessageImage();
    }

    @When("^click cancel on define term master page$")
    public void click_cancel_on_define_term_master_page() throws Throwable {
       new TermMaster(driver).clickCancel();
    }

    @Then("^verify cancel on define term master page$")
    public void verify_cancel_on_define_term_master_page() throws Throwable {
        new TermMaster(driver).verifyCancel();
    }

    @When("^select record on define term master page$")
    public void select_record_on_define_term_master_page() throws Throwable {
       new TermMaster(driver).clickView();
       new TermMaster(driver).selectRecord();
    }

    @When("^delete record on define term master page$")
    public void delete_record_on_define_term_master_page() throws Throwable {
        new TermMaster(driver).clickDelete();
        new TermMaster(driver).clickYes();
    }

    @Then("^verify delete message on define term master page$")
    public void verify_delete_message_on_define_term_master_page() throws Throwable {
       new TermMaster(driver).verifyDeleteMessage();
       new TermMaster(driver).verifySuccessMessageImage();
    }

    @When("^modify record on define term master page$")
    public void modify_record_on_define_term_master_page() throws Throwable {
       new TermMaster(driver).clickModify();
       new TermMaster(driver).clickYes();
    }

    @Then("^verify modify message on define term master page$")
    public void verify_modify_message_on_define_term_master_page() throws Throwable {
        new TermMaster(driver).verifyModifyMessage();
        new TermMaster(driver).verifySuccessMessageImage();
    }

//define last result
    @When("^user open define last result page$")
    public void user_open_define_last_result_page() throws Throwable {
        new DefineLastResult(driver).openDefineLastResult();
    }

    @When("^click save on define last result page$")
    public void click_save_on_define_last_result_page() throws Throwable {
        new DefineLastResult(driver).clickSave();
    }

    @Then("^verify blank field on define last result page$")
    public void verify_blank_field_on_define_last_result_page() throws Throwable {
      new DefineLastResult(driver).validateBlank();
    }

    @When("^enter last result as \"([^\"]*)\"$")
    public void enter_last_result_as(String arg1) throws Throwable {
       new DefineLastResult(driver).enterLastResultName(arg1);
    }

    @Then("^verify numeric data on define last result page$")
    public void verify_numeric_data_on_define_last_result_page() throws Throwable {
      new DefineLastResult(driver).validateNumericValue();
    }

    @Then("^verify alphanumeric data on define last result page$")
    public void verify_alphanumeric_data_on_define_last_result_page() throws Throwable {
        new DefineLastResult(driver).validateNumericValue();
    }

    @When("^enter \"([^\"]*)\" characters in last result$")
    public void enter_characters_in_last_result(int arg1) throws Throwable {
        new DefineLastResult(driver).enterLastResultName(arg1);
    }

    @Then("^verify character length on define last result page$")
    public void verify_character_length_on_define_last_result_page() throws Throwable {
       new DefineLastResult(driver).validateLength();
    }

    @Then("^verify duplicate value on define last result page$")
    public void verify_duplicate_value_on_define_last_result_page() throws Throwable {
        new DefineLastResult(driver).verifyDuplicateValue();
        new DefineLastResult(driver).verifyWarningMessageImage();
    }

    @Then("^verify save message on define last result page$")
    public void verify_save_message_on_define_last_result_page() throws Throwable {
        new DefineLastResult(driver).verifySaveMessage();
        new DefineLastResult(driver).verifySuccessMessageImage();
    }

    @When("^click cancel on define last result page$")
    public void click_cancel_on_define_last_result_page() throws Throwable {
       new DefineLastResult(driver).clickCancel();
    }

    @Then("^verify cancel on define last result page$")
    public void verify_cancel_on_define_last_result_page() throws Throwable {
        new DefineLastResult(driver).verifyCancel();
    }

    @When("^select record on define last result page$")
    public void select_record_on_define_last_result_page() throws Throwable {
       new DefineLastResult(driver).clickView();
       new DefineLastResult(driver).selectRecord();
    }

    @When("^delete record on define last result page$")
    public void delete_record_on_define_last_result_page() throws Throwable {
     new DefineLastResult(driver).clickDelete();
     new DefineLastResult(driver).clickYes();
    }

    @Then("^verify delete message on define last result page$")
    public void verify_delete_message_on_define_last_result_page() throws Throwable {
       new DefineLastResult(driver).verifyDeleteMessage();
       new DefineLastResult(driver).verifySuccessMessageImage();
    }

    @When("^modify record on define last result page$")
    public void modify_record_on_define_last_result_page() throws Throwable {
       new DefineLastResult(driver).clickModify();
       new DefineLastResult(driver).clickYes();
    }

    @Then("^verify modify message on define last result page$")
    public void verify_modify_message_on_define_last_result_page() throws Throwable {
        new DefineLastResult(driver).verifyModifyMessage();
        new DefineLastResult(driver).verifySuccessMessageImage();
    }

//define promotion master
    @When("^user open define promotion master page$")
    public void user_open_define_promotion_master_page() throws Throwable {
        new DefinePromotionMaster(driver).openDefinePromotionMaster();
    }

    @When("^click save on define promotion master page$")
    public void click_save_on_define_promotion_master_page() throws Throwable {
        new DefinePromotionMaster(driver).clickSave();
    }

    @Then("^verify blank field on define promotion master page$")
    public void verify_blank_field_on_define_promotion_master_page() throws Throwable {
        new DefinePromotionMaster(driver).validateBlank();
    }

    @When("^enter promotion master as \"([^\"]*)\"$")
    public void enter_promotion_master_as(String arg1) throws Throwable {
        new DefinePromotionMaster(driver).enterPromotionName(arg1);
    }

    @Then("^verify save message on define promotion master page$")
    public void verify_save_message_on_define_promotion_master_page() throws Throwable{
        new DefinePromotionMaster(driver).verifySaveMessage();
        new DefinePromotionMaster(driver).verifySuccessMessageImage();
    }

    @When("^enter \"([^\"]*)\" characters in promotion master$")
    public void enter_characters_in_promotion_master(int arg1) throws Throwable {
        new DefinePromotionMaster(driver).enterPromotionNameNTimes(arg1);
    }

    @Then("^verify character length on define promotion master page$")
    public void verify_character_length_on_define_promotion_master_page() throws Throwable {
        new DefinePromotionMaster(driver).validateLength();
    }

    @Then("^verify duplicate value on define promotion master page$")
    public void verify_duplicate_value_on_define_promotion_master_page() throws Throwable {
        new DefinePromotionMaster(driver).verifyDuplicateValue();
        new DefinePromotionMaster(driver).verifyWarningMessageImage();
    }

    @When("^click cancel on define promotion master page$")
    public void click_cancel_on_define_promotion_master_page() throws Throwable {
        new DefinePromotionMaster(driver).clickCancel();
    }

    @Then("^verify cancel on define promotion master page$")
    public void verify_cancel_on_define_promotion_master_page() throws Throwable {
        new DefinePromotionMaster(driver).verifyCancel();
    }

    @When("^select record on define promotion master page$")
    public void select_record_on_define_promotion_master_page() throws Throwable {
        new DefinePromotionMaster(driver).clickView();
        new DefinePromotionMaster(driver).selectRecord();
    }

    @When("^delete record on define promotion master page$")
    public void delete_record_on_define_promotion_master_page() throws Throwable {
        new DefinePromotionMaster(driver).clickDelete();
        new DefinePromotionMaster(driver).clickYes();
    }

    @Then("^verify delete message on define promotion master page$")
    public void verify_delete_message_on_define_promotion_master_page() throws Throwable {
        new DefinePromotionMaster(driver).verifyDeleteMessage();
        new DefinePromotionMaster(driver).verifySuccessMessageImage();
    }

    @When("^modify record on define promotion master page$")
    public void modify_record_on_define_promotion_master_page() throws Throwable {
        new DefinePromotionMaster(driver).clickModify();
        new DefinePromotionMaster(driver).clickYes();
    }

    @Then("^verify modify message on define promotion master page$")
    public void verify_modify_message_on_define_promotion_master_page() throws Throwable {
        new DefinePromotionMaster(driver).verifyModifyMessage();
        new DefinePromotionMaster(driver).verifySuccessMessageImage();
    }

//define character
    @When("^user open define character page$")
    public void user_open_define_character_page() throws Throwable {
        new DefineCharacter(driver).openDefineCharacter();
    }

    @When("^click save on define character page$")
    public void click_save_on_define_character_page() throws Throwable {
        new DefineCharacter(driver).clickSave();
    }

    @Then("^verify blank field on define character page$")
    public void verify_blank_field_on_define_character_page() throws Throwable {
        new DefineCharacter(driver).validateBlank();
    }

    @When("^enter character as \"([^\"]*)\"$")
    public void enter_character_as(String arg1) throws Throwable {
        new DefineCharacter(driver).enterCharacterName(arg1);
    }

    @Then("^verify numeric data on define character page$")
    public void verify_numeric_data_on_define_character_page() throws Throwable {
       new DefineCharacter(driver).validateNumericValue();
    }

    @Then("^verify alphanumeric data on define character page$")
    public void verify_alphanumeric_data_on_define_character_page() throws Throwable {
        new DefineCharacter(driver).validateNumericValue();
    }

    @When("^enter \"([^\"]*)\" characters in character$")
    public void enter_characters_in_character(int arg1) throws Throwable {
        new DefineCharacter(driver).enterCharacterName(arg1);
    }

    @Then("^verify character length on define character page$")
    public void verify_character_length_on_define_character_page() throws Throwable {
        new DefineCharacter(driver).validateLength();
    }

    @Then("^verify duplicate value on define character page$")
    public void verify_duplicate_value_on_define_character_page() throws Throwable {
        new DefineCharacter(driver).verifyDuplicateValue();
        new DefineCharacter(driver).verifyWarningMessageImage();
    }

    @Then("^verify save message on define character page$")
    public void verify_save_message_on_define_character_page() throws Throwable {
        new DefineCharacter(driver).verifySaveMessage();
        new DefineCharacter(driver).verifySuccessMessageImage();
    }

    @When("^click cancel on define character page$")
    public void click_cancel_on_define_character_page() throws Throwable {
        new DefineCharacter(driver).clickCancel();
    }

    @Then("^verify cancel on define character page$")
    public void verify_cancel_on_define_character_page() throws Throwable {
        new DefineCharacter(driver).verifyCancel();
    }

    @When("^select record on define character page$")
    public void select_record_on_define_character_page() throws Throwable {
        new DefineCharacter(driver).clickView();
        new DefineCharacter(driver).selectRecord();
    }

    @When("^delete record on define character page$")
    public void delete_record_on_define_character_page() throws Throwable {
        new DefineCharacter(driver).clickDelete();
        new DefineCharacter(driver).clickYes();
    }

    @Then("^verify delete message on define character page$")
    public void verify_delete_message_on_define_character_page() throws Throwable {
        new DefineCharacter(driver).verifyDeleteMessage();
        new DefineCharacter(driver).verifySuccessMessageImage();
    }

    @When("^modify record on define character page$")
    public void modify_record_on_define_character_page() throws Throwable {
        new DefineCharacter(driver).clickModify();
        new DefineCharacter(driver).clickYes();
    }

    @Then("^verify modify message on define character page$")
    public void verify_modify_message_on_define_character_page() throws Throwable {
        new DefineCharacter(driver).verifyModifyMessage();
        new DefineCharacter(driver).verifySuccessMessageImage();
    }

//define category
    @When("^user open define category page$")
    public void user_open_define_category_page() throws Throwable {
        new DefineCategory(driver).openDefineCategory();
    }

    @When("^click save on define category page$")
    public void click_save_on_define_category_page() throws Throwable {
        new DefineCategory(driver).clickSave();
    }

    @Then("^verify blank field on define category page$")
    public void verify_blank_field_on_define_category_page() throws Throwable {
        new DefineCategory(driver).validateBlank();
    }

    @When("^enter category as \"([^\"]*)\"$")
    public void enter_category_as(String arg1) throws Throwable {
        new DefineCategory(driver).enterCategoryName(arg1);
    }

    @Then("^verify numeric data on define category page$")
    public void verify_numeric_data_on_define_category_page() throws Throwable {
        new DefineCategory(driver).validateNumericValue();
    }

    @Then("^verify alphanumeric data on define category page$")
    public void verify_alphanumeric_data_on_define_category_page() throws Throwable {
        new DefineCategory(driver).validateNumericValue();
    }

    @When("^enter \"([^\"]*)\" characters in category$")
    public void enter_characters_in_category(int arg1) throws Throwable {
        new DefineCategory(driver).enterCategoryName(arg1);
    }

    @Then("^verify category length on define category page$")
    public void verify_category_length_on_define_category_page() throws Throwable {
        new DefineCategory(driver).validateLength();
    }

    @Then("^verify duplicate value on define category page$")
    public void verify_duplicate_value_on_define_category_page() throws Throwable {
        new DefineCategory(driver).verifyDuplicateValue();
        new DefineCategory(driver).verifyWarningMessageImage();
    }

    @Then("^verify save message on define category page$")
    public void verify_save_message_on_define_category_page() throws Throwable {
        new DefineCategory(driver).verifySaveMessage();
        new DefineCategory(driver).verifySuccessMessageImage();
    }

    @When("^click cancel on define category page$")
    public void click_cancel_on_define_category_page() throws Throwable {
        new DefineCategory(driver).clickCancel();
    }

    @Then("^verify cancel on define category page$")
    public void verify_cancel_on_define_category_page() throws Throwable {
        new DefineCategory(driver).verifyCancel();
    }

    @When("^select record on define category page$")
    public void select_record_on_define_category_page() throws Throwable {
        new DefineCategory(driver).clickView();
        new DefineCategory(driver).selectRecord();
    }

    @When("^delete record on define category page$")
    public void delete_record_on_define_category_page() throws Throwable {
        new DefineCategory(driver).clickDelete();
        new DefineCategory(driver).clickYes();
    }

    @Then("^verify delete message on define category page$")
    public void verify_delete_message_on_define_category_page() throws Throwable {
        new DefineCategory(driver).verifyDeleteMessage();
        new DefineCategory(driver).verifySuccessMessageImage();
    }

    @When("^modify record on define category page$")
    public void modify_record_on_define_category_page() throws Throwable {
        new DefineCategory(driver).clickModify();
        new DefineCategory(driver).clickYes();
    }

    @Then("^verify modify message on define category page$")
    public void verify_modify_message_on_define_category_page() throws Throwable {
        new DefineCategory(driver).verifyModifyMessage();
        new DefineCategory(driver).verifySuccessMessageImage();
    }

//define religion
    @When("^user open define religion page$")
    public void user_open_define_religion_page() throws Throwable {
        new DefineReligion(driver).openDefineReligion();
    }

    @When("^click save on define religion page$")
    public void click_save_on_define_religion_page() throws Throwable {
        new DefineReligion(driver).clickSave();
    }

    @Then("^verify blank field on define religion page$")
    public void verify_blank_field_on_define_religion_page() throws Throwable {
        new DefineReligion(driver).validateBlank();
    }

    @When("^enter religion as \"([^\"]*)\"$")
    public void enter_religion_as(String arg1) throws Throwable {
        new DefineReligion(driver).enterReligionName(arg1);
    }

    @Then("^verify numeric data on define religion page$")
    public void verify_numeric_data_on_define_religion_page() throws Throwable {
        new DefineReligion(driver).validateNumericValue();
    }

    @Then("^verify alphanumeric data on define religion page$")
    public void verify_alphanumeric_data_on_define_religion_page() throws Throwable {
        new DefineReligion(driver).validateNumericValue();
    }

    @When("^enter \"([^\"]*)\" characters in religion$")
    public void enter_characters_in_religion(int arg1) throws Throwable {
        new DefineReligion(driver).enterReligionName(arg1);
    }

    @Then("^verify religion length on define religion page$")
    public void verify_religion_length_on_define_religion_page() throws Throwable {
        new DefineReligion(driver).validateLength();
    }

    @Then("^verify duplicate value on define religion page$")
    public void verify_duplicate_value_on_define_religion_page() throws Throwable {
        new DefineReligion(driver).verifyDuplicateValue();
        new DefineReligion(driver).verifyWarningMessageImage();
    }

    @Then("^verify save message on define religion page$")
    public void verify_save_message_on_define_religion_page() throws Throwable {
        new DefineReligion(driver).verifySaveMessage();
        new DefineReligion(driver).verifySuccessMessageImage();
    }

    @When("^click cancel on define religion page$")
    public void click_cancel_on_define_religion_page() throws Throwable {
        new DefineReligion(driver).clickCancel();
    }

    @Then("^verify cancel on define religion page$")
    public void verify_cancel_on_define_religion_page() throws Throwable {
        new DefineReligion(driver).verifyCancel();
    }

    @When("^select record on define religion page$")
    public void select_record_on_define_religion_page() throws Throwable {
        new DefineReligion(driver).clickView();
        new DefineReligion(driver).selectRecord();
    }

    @When("^delete record on define religion page$")
    public void delete_record_on_define_religion_page() throws Throwable {
        new DefineReligion(driver).clickDelete();
        new DefineReligion(driver).clickYes();
    }

    @Then("^verify delete message on define religion page$")
    public void verify_delete_message_on_define_religion_page() throws Throwable {
        new DefineReligion(driver).verifyDeleteMessage();
        new DefineReligion(driver).verifySuccessMessageImage();
    }

    @When("^modify record on define religion page$")
    public void modify_record_on_define_religion_page() throws Throwable {
        new DefineReligion(driver).clickModify();
        new DefineReligion(driver).clickYes();
    }

    @Then("^verify modify message on define religion page$")
    public void verify_modify_message_on_define_religion_page() throws Throwable {
        new DefineReligion(driver).verifyModifyMessage();
        new DefineReligion(driver).verifySuccessMessageImage();
    }

//define wing
    @When("^user open define wing page$")
    public void user_open_define_wing_page() throws Throwable {
        new DefineWing(driver).openDefineWing();
    }

    @When("^click save on define wing page$")
    public void click_save_on_define_wing_page() throws Throwable {
        new DefineWing(driver).clickSave();
    }

    @Then("^verify blank field on define wing page$")
    public void verify_blank_field_on_define_wing_page() throws Throwable {
        new DefineWing(driver).validateBlank();
    }

    @When("^enter wing as \"([^\"]*)\"$")
    public void enter_wing_as(String arg1) throws Throwable {
        new DefineWing(driver).enterWingName(arg1);
    }

    @Then("^verify save message on define wing page$")
    public void verify_save_message_on_define_wing_page() throws Throwable {
        new DefineWing(driver).verifySaveMessage();
        new DefineWing(driver).verifySuccessMessageImage();
    }

    @When("^enter \"([^\"]*)\" characters in wing$")
    public void enter_characters_in_wing(int arg1) throws Throwable {
        new DefineWing(driver).enterWingName(arg1);
    }

    @Then("^verify character length on define wing page$")
    public void verify_character_length_on_define_wing_page() throws Throwable {
        new DefineWing(driver).validateLength();
    }

    @Then("^verify duplicate value on define wing page$")
    public void verify_duplicate_value_on_define_wing_page() throws Throwable {
        new DefineWing(driver).verifyDuplicateValue();
        new DefineWing(driver).verifyWarningMessageImage();
    }

    @When("^click cancel on define wing page$")
    public void click_cancel_on_define_wing_page() throws Throwable {
        new DefineWing(driver).clickCancel();
    }

    @Then("^verify cancel on define wing page$")
    public void verify_cancel_on_define_wing_page() throws Throwable {
        new DefineWing(driver).verifyCancel();
    }

    @When("^select record on define wing page$")
    public void select_record_on_define_wing_page() throws Throwable {
        new DefineWing(driver).clickView();
        new DefineWing(driver).selectRecord();
    }

    @When("^delete record on define wing page$")
    public void delete_record_on_define_wing_page() throws Throwable {
        new DefineWing(driver).clickDelete();
        new DefineWing(driver).clickYes();
    }

    @Then("^verify delete message on define wing page$")
    public void verify_delete_message_on_define_wing_page() throws Throwable {
        new DefineWing(driver).verifyDeleteMessage();
        new DefineWing(driver).verifySuccessMessageImage();
    }

    @When("^modify record on define wing page$")
    public void modify_record_on_define_wing_page() throws Throwable {
        new DefineWing(driver).clickModify();
        new DefineWing(driver).clickYes();
    }

    @Then("^verify modify message on define wing page$")
    public void verify_modify_message_on_define_wing_page() throws Throwable {
        new DefineWing(driver).verifyModifyMessage();
        new DefineWing(driver).verifySuccessMessageImage();
    }

//define caste
    @When("^user open define caste page$")
    public void user_open_define_caste_page() throws Throwable {
        new DefineCaste(driver).openDefineCaste();
    }

    @When("^click save on define caste page$")
    public void click_save_on_define_caste_page() throws Throwable {
        new DefineCaste(driver).clickSave();
    }

    @Then("^verify blank field on define caste page$")
    public void verify_blank_field_on_define_caste_page() throws Throwable {
        new DefineCaste(driver).validateBlank();
    }

    @When("^enter caste as \"([^\"]*)\"$")
    public void enter_caste_as(String arg1) throws Throwable {
        new DefineCaste(driver).enterCasteName(arg1);
    }

    @Then("^verify numeric data on define caste page$")
    public void verify_numeric_data_on_define_caste_page() throws Throwable {
        new DefineCaste(driver).validateNumericValue();
    }

    @Then("^verify alphanumeric data on define caste page$")
    public void verify_alphanumeric_data_on_define_caste_page() throws Throwable {
        new DefineCaste(driver).validateNumericValue();
    }

    @When("^enter \"([^\"]*)\" characters in caste$")
    public void enter_characters_in_caste(int arg1) throws Throwable {
        new DefineCaste(driver).enterCasteName(arg1);
    }

    @Then("^verify caste length on define caste page$")
    public void verify_caste_length_on_define_caste_page() throws Throwable {
        new DefineCaste(driver).validateLength();
    }

    @Then("^verify duplicate value on define caste page$")
    public void verify_duplicate_value_on_define_caste_page() throws Throwable {
        new DefineCaste(driver).verifyDuplicateValue();
        new DefineCaste(driver).verifyWarningMessageImage();
    }

    @Then("^verify save message on define caste page$")
    public void verify_save_message_on_define_caste_page() throws Throwable {
        new DefineCaste(driver).verifySaveMessage();
        new DefineCaste(driver).verifySuccessMessageImage();
    }

    @When("^click cancel on define caste page$")
    public void click_cancel_on_define_caste_page() throws Throwable {
        new DefineCaste(driver).clickCancel();
    }

    @Then("^verify cancel on define caste page$")
    public void verify_cancel_on_define_caste_page() throws Throwable {
        new DefineCaste(driver).verifyCancel();
    }

    @When("^select record on define caste page$")
    public void select_record_on_define_caste_page() throws Throwable {
        new DefineCaste(driver).clickView();
        new DefineCaste(driver).selectRecord();
    }

    @When("^delete record on define caste page$")
    public void delete_record_on_define_caste_page() throws Throwable {
        new DefineCaste(driver).clickDelete();
        new DefineCaste(driver).clickYes();
    }

    @Then("^verify delete message on define caste page$")
    public void verify_delete_message_on_define_caste_page() throws Throwable {
        new DefineCaste(driver).verifyDeleteMessage();
        new DefineCaste(driver).verifySuccessMessageImage();
    }

    @When("^modify record on define caste page$")
    public void modify_record_on_define_caste_page() throws Throwable {
        new DefineCaste(driver).clickModify();
        new DefineCaste(driver).clickYes();
    }

    @Then("^verify modify message on define caste page$")
    public void verify_modify_message_on_define_caste_page() throws Throwable {
        new DefineCaste(driver).verifyModifyMessage();
        new DefineCaste(driver).verifySuccessMessageImage();
    }

//define section
    @When("^user open define section page$")
    public void user_open_define_section_page() throws Throwable {
        new DefineSection(driver).openDefineSection();
    }

    @When("^click save on define section page$")
    public void click_save_on_define_section_page() throws Throwable {
        new DefineSection(driver).clickSave();
    }

    @Then("^verify validation message on section name$")
    public void verify_validation_message_on_section_name() throws Throwable {
        new DefineSection(driver).validateBlankOnSectionName();
    }

    @Then("^verify validation message on order no$")
    public void verify_validation_message_on_order_no() throws Throwable {
        new DefineSection(driver).validateBlankOnOrderNo();
    }

    @When("^enter order no as \"([^\"]*)\"$")
    public void enter_order_no_as(String arg1) throws Throwable {
        new DefineSection(driver).enterOrderNo(arg1);
    }

    @When("^enter section name as \"([^\"]*)\"$")
    public void enter_section_name_as(String arg1) throws Throwable {
        new DefineSection(driver).enterSectionName(arg1);
    }

    @When("^verify save message on define section page$")
    public void verify_save_message_on_define_section_page() throws Throwable {
        new DefineSection(driver).verifySaveMessage();
        new DefineSection(driver).verifySuccessMessageImage();
    }

    @When("^enter \"([^\"]*)\" characters in section name$")
    public void enter_characters_in_section_name(int arg1) throws Throwable {
        new DefineSection(driver).enterSectionName(arg1);
    }

    @When("^enter \"([^\"]*)\" characters in order no$")
    public void enter_characters_in_order_no(int arg1) throws Throwable {
        new DefineSection(driver).enterOrderNo(arg1);
    }

    @Then("^verify length validation message on define section page$")
    public void verify_length_validation_message_on_define_section_page() throws Throwable {
        new DefineSection(driver).validateLengthOnSectionName();
        new DefineSection(driver).validateLengthOnOrderNo();
    }

    @Then("^verify number validation message on define section page$")
    public void verify_number_validation_message_on_define_section_page() throws Throwable {
        new DefineSection(driver).validateNumericValue();
    }

    @Then("^verify alphanumeric validation message on define section page$")
    public void verify_alphanumeric_validation_message_on_define_section_page() throws Throwable {
        new DefineSection(driver).validateNumericValue();
    }

    @Then("^verify duplicate value on define section page$")
    public void verify_duplicate_value_on_define_section_page() throws Throwable {
        new DefineSection(driver).verifyDuplicateValue();
        new DefineSection(driver).verifyWarningMessageImage();
    }

    @When("^click cancel on define section page$")
    public void click_cancel_on_define_section_page() throws Throwable {
        new DefineSection(driver).clickCancel();
    }

    @Then("^verify cancel on define section page$")
    public void verify_cancel_on_define_section_page() throws Throwable {
        new DefineSection(driver).verifyCancel();
    }

    @When("^select record on define section page$")
    public void select_record_on_define_section_page() throws Throwable {
        new DefineSection(driver).clickView();
        new DefineSection(driver).selectRecord();
    }

    @When("^delete record on define section page$")
    public void delete_record_on_define_section_page() throws Throwable {
        new DefineSection(driver).clickDelete();
        new DefineSection(driver).clickYes();
    }

    @Then("^verify delete message on define section page$")
    public void verify_delete_message_on_define_section_page() throws Throwable {
        new DefineSection(driver).verifyDeleteMessage();
        new DefineSection(driver).verifySuccessMessageImage();
    }

    @When("^modify record on define section page$")
    public void modify_record_on_define_section_page() throws Throwable {
        new DefineSection(driver).clickModify();
        new DefineSection(driver).clickYes();
    }

    @Then("^verify modify message on define section page$")
    public void verify_modify_message_on_define_section_page() throws Throwable {
        new DefineSection(driver).verifyModifyMessage();
        new DefineSection(driver).verifySuccessMessageImage();
    }

//daily collection report
    @When("^user open daily fee collection report$")
    public void user_open_daily_fee_collection_report() throws Throwable {
        new DailyFeeCollection(driver).openDailyFeeCollection();
    }

    @When("^verify validation when no class is selected on daily fee collection$")
    public void verify_validation_when_no_class_is_selected_on_daily_fee_collection() throws Throwable {
        new DailyFeeCollection(driver).validateClass();
    }

    @When("^verify validation when no entry mode is selected on daily fee collection$")
    public void verify_validation_when_no_entry_mode_is_selected() throws Throwable {
        new DailyFeeCollection(driver).validateEntryMode();
    }

    @When("^verify validation when no fee type is selected on daily fee collection$")
    public void verify_validation_when_no_fee_type_is_selected_on_daily_fee_collection() throws Throwable {
        new DailyFeeCollection(driver).validateFeeType();
    }

    @When("^verify validation when no pay mode is selected on daily fee collection$")
    public void verify_validation_when_no_pay_mode_is_selected_on_daily_fee_collection() throws Throwable {
        new DailyFeeCollection(driver).validatePayMode();
    }

    @When("^verify validation when no head is selected on daily fee collection$")
    public void verify_validation_when_no_head_is_selected_on_daily_fee_collection() throws Throwable {
        new DailyFeeCollection(driver).validateHead();
    }

    @When("^verify validation when no date to is selected on daily fee collection$")
    public void verify_validation_when_no_date_to_is_selected_on_daily_fee_collection() throws Throwable {
        new DailyFeeCollection(driver).validateToDate();
    }

    @When("^verify validation when no date from is selected on daily fee collection$")
    public void verify_validation_when_no_date_from_is_selected_on_daily_fee_collection() throws Throwable {
        new DailyFeeCollection(driver).validateDateFrom();
    }

    @When("^click receipt no range on daily fee collection$")
    public void click_receipt_no_range_on_daily_fee_collection() throws Throwable {
        new DailyFeeCollection(driver).clickReceiptRange();
    }

    @When("^enter value \"([^\"]*)\" in receipt from on daily fee collection$")
    public void enter_value_in_receipt_from_on_daily_fee_collection(String arg1) throws Throwable {
        new DailyFeeCollection(driver).enterReceiptFrom(arg1);
        new DailyFeeCollection(driver).pressEnterInReceiptFrom();
    }

    @Then("^verify numeric validation for receipt from on daily fee collection$")
    public void verify_numeric_validation_for_receipt_from_on_daily_fee_collection() throws Throwable {
        new DailyFeeCollection(driver).validateReceiptFromMessage();
    }

    @Then("^enter \"([^\"]*)\" digits in receipt from on daily fee collection$")
    public void enter_digits_in_receipt_from_on_daily_fee_collection(int arg1) throws Throwable {
        new DailyFeeCollection(driver).enterReceiptFrom(arg1);
        new DailyFeeCollection(driver).pressEnterInReceiptFrom();
    }

    @Then("^verify length validation on receipt from on daily fee collection$")
    public void verify_length_validation_on_receipt_from_on_daily_fee_collection() throws Throwable {
        new DailyFeeCollection(driver).validateReceiptFromLength();
    }

    @Then("^enter value \"([^\"]*)\" in receipt to on daily fee collection$")
    public void enter_value_in_receipt_to_on_daily_fee_collection(String arg1) throws Throwable {
        new DailyFeeCollection(driver).enterReceiptTo(arg1);
        new DailyFeeCollection(driver).pressEnterReceiptTo();
    }

    @Then("^verify numeric validation for receipt to on daily fee collection$")
    public void verify_numeric_validation_for_receipt_to_on_daily_fee_collection() throws Throwable {
        new DailyFeeCollection(driver).validateReceiptToMessage();
    }

    @Then("^enter \"([^\"]*)\" digits in receipt to on daily fee collection$")
    public void enter_digits_in_receipt_to_on_daily_fee_collection(int arg1) throws Throwable {
        new DailyFeeCollection(driver).enterReceiptTo(arg1);
        new DailyFeeCollection(driver).pressEnterReceiptTo();
    }

    @Then("^verify length validation on receipt to on daily fee collection$")
    public void verify_length_validation_on_receipt_to_on_daily_fee_collection() throws Throwable {
        new DailyFeeCollection(driver).validateReceiptToLength();
    }

    @When("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on daily fee collection$")
    public void select_from_date_as_month_year_and_day_on_daily_fee_collection(String arg1, String arg2, String arg3) throws Throwable {
        new DailyFeeCollection(driver).selectFromDate(arg1, arg2, arg3);
    }

    @When("^select to date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on daily fee collection$")
    public void select_to_date_as_month_year_and_day_on_daily_fee_collection(String arg1, String arg2, String arg3) throws Throwable {
        new DailyFeeCollection(driver).selectToDate(arg1, arg2, arg3);
    }

    @When("^user enter from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on daily fee collection$")
    public void user_enter_from_date_as_month_year_and_day_on_daily_fee_collection(String arg1, String arg2, String arg3) throws Throwable {
        new DailyFeeCollection(driver).selectFromDate(arg1, arg2, arg3);
    }

    @When("^to date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on daily fee collection$")
    public void to_date_as_month_year_and_day_on_daily_fee_collection(String arg1, String arg2, String arg3) throws Throwable {
        new DailyFeeCollection(driver).selectToDate(arg1, arg2, arg3);
    }

    @When("^click show on daily fee collection$")
    public void click_show_on_daily_fee_collection() throws Throwable {
        new DailyFeeCollection(driver).clickShow();
    }

    @Then("^verify alert message for date on daily fee collection$")
    public void verify_alert_message_for_date_on_daily_fee_collection() throws Throwable {
        new DailyFeeCollection(driver).validateDateAlertMessage();
    }

    @Then("^verify alert message for blank receipt from on daily fee collection$")
    public void verify_alert_message_for_blank_receipt_from_on_daily_fee_collection() throws Throwable {
        new DailyFeeCollection(driver).validateBlankReceiptFromAlertMessage();
    }

    @Then("^verify alert message for blank receipt to on daily fee collection$")
    public void verify_alert_message_for_blank_receipt_to_on_daily_fee_collection() throws Throwable {
        new DailyFeeCollection(driver).validateBlankReceiptToAlertMessage();
    }

    @Then("^verify alert message for invalid receipt range on daily fee collection$")
    public void verify_alert_message_for_invalid_receipt_range_on_daily_fee_collection() throws Throwable {
       new DailyFeeCollection(driver).validateInvalidReceiptRangeAlertMessage();
    }

    @When("^select school with index \"([^\"]*)\" on daily fee collection$")
    public void select_school_with_index_on_daily_fee_collection(int arg1) throws Throwable {
        new DailyFeeCollection(driver).selectSchool(arg1);
    }

    @When("^select wing with index \"([^\"]*)\" on daily fee collection$")
    public void select_wing_with_index_on_daily_fee_collection(int arg1) throws Throwable {
        new DailyFeeCollection(driver).selectWing(arg1);
    }

    @When("^select class on daily fee collection$")
    public void select_class_on_daily_fee_collection() throws Throwable {
        new DailyFeeCollection(driver).selectClass();
    }

    @When("^select board with index \"([^\"]*)\" on daily fee collection$")
    public void select_board_with_index_on_daily_fee_collection(int arg1) throws Throwable {
        new DailyFeeCollection(driver).selectBoard(arg1);
    }

    @When("^select entry mode on daily fee collection$")
    public void select_entry_mode_on_daily_fee_collection() throws Throwable {
        new DailyFeeCollection(driver).selectEntryMode();
        new DailyFeeCollection(driver).selectEntryMode();
        //driver.findElement(By.xpath("//*[@id=\"MainLeftPanel\"]/div/div/div[5]/div/div/button")).click();

    }

    @When("^select fee type on daily fee collection$")
    public void select_fee_type_on_daily_fee_collection() throws Throwable {
        new DailyFeeCollection(driver).selectFeeType();
    }

    @When("^select pay mode on daily fee collection$")
    public void select_pay_mode_on_daily_fee_collection() throws Throwable {
        new DailyFeeCollection(driver).selectPayMode();
    }

    @When("^select head on daily fee collection$")
    public void select_head_on_daily_fee_collection() throws Throwable {
        new DailyFeeCollection(driver).selectHead();
    }

    @When("^select radio button \"([^\"]*)\" on daily fee collection$")
    public void select_radio_button_on_daily_fee_collection(String arg1) throws Throwable {
        new DailyFeeCollection(driver).clickButton(arg1);
    }

    @When("^select with settlement date on daily fee collection$")
    public void select_with_settlement_date_on_daily_fee_collection() throws Throwable {
        new DailyFeeCollection(driver).clickSettlementDate();
    }

    @When("^select with cheque clearance date on daily fee collection$")
    public void select_with_cheque_clearance_date_on_daily_fee_collection() throws Throwable {
        new DailyFeeCollection(driver).clickChequeClearanceDate();
    }

    @When("^select user with index \"([^\"]*)\" on daily fee collection$")
    public void select_user_with_index_on_daily_fee_collection(int arg1) throws Throwable {
        new DailyFeeCollection(driver).selectUser(arg1);
    }

//daily fee collection date wise with remark
    @When("^user open daily fee collection date wise with remark$")
    public void user_open_daily_fee_collection_date_wise_with_remark() throws Throwable {
        new DailyFeeCollectionDateWiseWithRemark(driver).openDailyFeeCollectionDateWiseWithRemark();
    }

    @When("^verify validation when no class is selected on daily fee collection date wise with remark$")
    public void verify_validation_when_no_class_is_selected_on_daily_fee_collection_date_wise_with_remark() throws Throwable {
        new DailyFeeCollectionDateWiseWithRemark(driver).validateClass();
    }

    @When("^verify validation when no entry mode is selected on daily fee collection date wise with remark$")
    public void verify_validation_when_no_entry_mode_is_selected_on_daily_fee_collection_date_wise_with_remark() throws Throwable {
       new DailyFeeCollectionDateWiseWithRemark(driver).validateEntryMode();
    }

    @When("^verify validation when no pay mode is selected on daily fee collection date wise with remark$")
    public void verify_validation_when_no_pay_mode_is_selected_on_daily_fee_collection_date_wise_with_remark() throws Throwable {
       new DailyFeeCollectionDateWiseWithRemark(driver).validatePayMode();
    }

    @When("^verify validation when no bank name is selected on daily fee collection date wise with remark$")
    public void verify_validation_when_no_bank_name_is_selected_on_daily_fee_collection_date_wise_with_remark() throws Throwable {
        new DailyFeeCollectionDateWiseWithRemark(driver).validateBankName();
    }

    @When("^verify validation when no head is selected on daily fee collection date wise with remark$")
    public void verify_validation_when_no_head_is_selected_on_daily_fee_collection_date_wise_with_remark() throws Throwable {
        new DailyFeeCollectionDateWiseWithRemark(driver).validateHead();
    }

    @When("^verify validation when no date from is selected on daily fee collection date wise with remark$")
    public void verify_validation_when_no_date_from_is_selected_on_daily_fee_collection_date_wise_with_remark() throws Throwable {
        new DailyFeeCollectionDateWiseWithRemark(driver).validateDateFrom();
    }

    @When("^verify validation when no date to is selected on daily fee collection date wise with remark$")
    public void verify_validation_when_no_date_to_is_selected_on_daily_fee_collection_date_wise_with_remark() throws Throwable {
        new DailyFeeCollectionDateWiseWithRemark(driver).validateToDate();
    }

    @When("^click receipt no range on daily fee collection date wise with remark$")
    public void click_receipt_no_range_on_daily_fee_collection_date_wise_with_remark() throws Throwable {
        new DailyFeeCollectionDateWiseWithRemark(driver).clickReceiptRange();
    }

    @When("^enter value \"([^\"]*)\" in receipt from on daily fee collection date wise with remark$")
    public void enter_value_in_receipt_from_on_daily_fee_collection_date_wise_with_remark(String arg1) throws Throwable {
        new DailyFeeCollectionDateWiseWithRemark(driver).enterReceiptFrom(arg1);
        new DailyFeeCollectionDateWiseWithRemark(driver).pressEnterInReceiptFrom();
    }

    @Then("^verify numeric validation for receipt from on daily fee collection date wise with remark$")
    public void verify_numeric_validation_for_receipt_from_on_daily_fee_collection_date_wise_with_remark() throws Throwable {
        new DailyFeeCollectionDateWiseWithRemark(driver).validateReceiptFromMessage();
    }

    @Then("^enter value \"([^\"]*)\" in receipt to on daily fee collection date wise with remark$")
    public void enter_value_in_receipt_to_on_daily_fee_collection_date_wise_with_remark(String arg1) throws Throwable {
        new DailyFeeCollectionDateWiseWithRemark(driver).enterReceiptTo(arg1);
        new DailyFeeCollectionDateWiseWithRemark(driver).pressEnterReceiptTo();
    }

    @Then("^verify numeric validation for receipt to on daily fee collection date wise with remark$")
    public void verify_numeric_validation_for_receipt_to_on_daily_fee_collection_date_wise_with_remark() throws Throwable {
        new  DailyFeeCollectionDateWiseWithRemark(driver).validateReceiptToMessage();
    }

    @Then("^enter \"([^\"]*)\" digits in receipt from on daily fee collection date wise with remark$")
    public void enter_digits_in_receipt_from_on_daily_fee_collection_date_wise_with_remark(int arg1) throws Throwable {
        new DailyFeeCollectionDateWiseWithRemark(driver).enterReceiptFrom(arg1);
        new DailyFeeCollectionDateWiseWithRemark(driver).pressEnterInReceiptFrom();
    }

    @Then("^verify length validation on receipt from on daily fee collection date wise with remark$")
    public void verify_length_validation_on_receipt_from_on_daily_fee_collection_date_wise_with_remark() throws Throwable {
        new DailyFeeCollectionDateWiseWithRemark(driver).validateReceiptFromLength();
    }

    @Then("^enter \"([^\"]*)\" digits in receipt to on daily fee collection date wise with remark$")
    public void enter_digits_in_receipt_to_on_daily_fee_collection_date_wise_with_remark(int arg1) throws Throwable {
        new DailyFeeCollectionDateWiseWithRemark(driver).enterReceiptTo(arg1);
        new DailyFeeCollectionDateWiseWithRemark(driver).pressEnterReceiptTo();
    }

    @Then("^verify length validation on receipt to on daily fee collection date wise with remark$")
    public void verify_length_validation_on_receipt_to_on_daily_fee_collection_date_wise_with_remark() throws Throwable {
        new DailyFeeCollectionDateWiseWithRemark(driver).validateReceiptToLength();
    }

    @When("^user enter from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on daily fee collection date wise with remark$")
    public void user_enter_from_date_as_month_year_and_day_on_daily_fee_collection_date_wise_with_remark(String arg1, String arg2, String arg3) throws Throwable {
        new DailyFeeCollectionDateWiseWithRemark(driver).selectFromDate(arg1, arg2, arg3);
    }

    @When("^to date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on daily fee collection date wise with remark$")
    public void to_date_as_month_year_and_day_on_daily_fee_collection_date_wise_with_remark(String arg1, String arg2, String arg3) throws Throwable {
        new DailyFeeCollectionDateWiseWithRemark(driver).selectToDate(arg1, arg2, arg3);
    }

    @When("^click show on daily fee collection date wise with remark$")
    public void click_show_on_daily_fee_collection_date_wise_with_remark() throws Throwable {
        new DailyFeeCollectionDateWiseWithRemark(driver).clickShow();
    }

    @Then("^verify alert message for date on daily fee collection date wise with remark$")
    public void verify_alert_message_for_date_on_daily_fee_collection_date_wise_with_remark() throws Throwable {
        new DailyFeeCollectionDateWiseWithRemark(driver).validateDateAlertMessage();
    }

    @Then("^verify alert message for blank receipt from on daily fee collection date wise with remark$")
    public void verify_alert_message_for_blank_receipt_from_on_daily_fee_collection_date_wise_with_remark() throws Throwable {
        new DailyFeeCollectionDateWiseWithRemark(driver).validateBlankReceiptFromAlertMessage();
    }

    @Then("^verify alert message for blank receipt to on daily fee collection date wise with remark$")
    public void verify_alert_message_for_blank_receipt_to_on_daily_fee_collection_date_wise_with_remark() throws Throwable {
        new DailyFeeCollectionDateWiseWithRemark(driver).validateBlankReceiptToAlertMessage();
    }

    @Then("^verify alert message for invalid receipt range on daily fee collection date wise with remark$")
    public void verify_alert_message_for_invalid_receipt_range_on_daily_fee_collection_date_wise_with_remark() throws Throwable {
        new DailyFeeCollectionDateWiseWithRemark(driver).validateInvalidReceiptRangeAlertMessage();
    }

    @Then("^select school with index \"([^\"]*)\" on daily fee collection date wise with remark$")
    public void select_school_with_index_on_daily_fee_collection_date_wise_with_remark(int arg1) throws Throwable {
        new DailyFeeCollectionDateWiseWithRemark(driver).selectSchool(arg1);
    }

    @Then("^select wing with index \"([^\"]*)\" on daily fee collection date wise with remark$")
    public void select_wing_with_index_on_daily_fee_collection_date_wise_with_remark(int arg1) throws Throwable {
        new DailyFeeCollectionDateWiseWithRemark(driver).selectWing(arg1);
    }

    @Then("^select class on daily fee collection date wise with remark$")
    public void select_class_on_daily_fee_collection_date_wise_with_remark() throws Throwable {
        new DailyFeeCollectionDateWiseWithRemark(driver).selectClass();
    }

    @Then("^select board with index \"([^\"]*)\" on daily fee collection date wise with remark$")
    public void select_board_with_index_on_daily_fee_collection_date_wise_with_remark(int arg1) throws Throwable {
        new DailyFeeCollectionDateWiseWithRemark(driver).selectBoard(arg1);
    }

    @Then("^select fee type with index \"([^\"]*)\" on daily fee collection date wise with remark$")
    public void select_fee_type_with_index_on_daily_fee_collection_date_wise_with_remark(int arg1) throws Throwable {
        new DailyFeeCollectionDateWiseWithRemark(driver).selectFeeType(arg1);
    }

    @Then("^select pay mode on daily fee collection date wise with remark$")
    public void select_pay_mode_on_daily_fee_collection_date_wise_with_remark() throws Throwable {
        new DailyFeeCollectionDateWiseWithRemark(driver).selectPayMode();
    }

    @Then("^select bank name on daily fee collection date wise with remark$")
    public void select_bank_name_on_daily_fee_collection_date_wise_with_remark() throws Throwable {
        new DailyFeeCollectionDateWiseWithRemark(driver).selectBankName();
    }

    @Then("^select head on daily fee collection date wise with remark$")
    public void select_head_on_daily_fee_collection_date_wise_with_remark() throws Throwable {
        new DailyFeeCollectionDateWiseWithRemark(driver).selectHead();
    }

    @Then("^select cheque details on daily fee collection date wise with remark$")
    public void select_cheque_details_on_daily_fee_collection_date_wise_with_remark() throws Throwable {
        new DailyFeeCollectionDateWiseWithRemark(driver).selectChequeDetails();
    }

    @Then("^select other details on daily fee collection date wise with remark$")
    public void select_other_details_on_daily_fee_collection_date_wise_with_remark() throws Throwable {
        new DailyFeeCollectionDateWiseWithRemark(driver).selectOtherDetails();
    }

    @Then("^select user with index \"([^\"]*)\" on daily fee collection date wise with remark$")
    public void select_user_with_index_on_daily_fee_collection_date_wise_with_remark(int arg1) throws Throwable {
        new DailyFeeCollectionDateWiseWithRemark(driver).selectUser(arg1);
    }

    @Then("^select new old with index \"([^\"]*)\" on daily fee collection date wise with remark$")
    public void select_new_old_with_index_on_daily_fee_collection_date_wise_with_remark(int arg1) throws Throwable {
        new DailyFeeCollectionDateWiseWithRemark(driver).selectNewOld(arg1);
    }

    @Then("^select student status with index \"([^\"]*)\" on daily fee collection date wise with remark$")
    public void select_student_status_with_index_on_daily_fee_collection_date_wise_with_remark(int arg1) throws Throwable {
        new DailyFeeCollectionDateWiseWithRemark(driver).selectStudentStatus(arg1);
    }

    @Then("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on daily fee collection date wise with remark$")
    public void select_from_date_as_month_year_and_day_on_daily_fee_collection_date_wise_with_remark(String arg1, String arg2, String arg3) throws Throwable {
        new DailyFeeCollectionDateWiseWithRemark(driver).selectFromDate(arg1, arg2, arg3);
    }

    @Then("^click settlement date on daily fee collection date wise with remark$")
    public void click_settlement_date_on_daily_fee_collection_date_wise_with_remark() throws Throwable {
        new DailyFeeCollectionDateWiseWithRemark(driver).clickSettlementDate();
    }

    @Then("^click cheque clearance date on daily fee collection date wise with remark$")
    public void click_cheque_clearance_date_on_daily_fee_collection_date_wise_with_remark() throws Throwable {
        new DailyFeeCollectionDateWiseWithRemark(driver).clickChequeClearanceDate();
    }

    @Then("^select radio button \"([^\"]*)\" on daily fee collection date wise with remark$")
    public void select_radio_button_on_daily_fee_collection_date_wise_with_remark(String arg1) throws Throwable {
        new DailyFeeCollectionDateWiseWithRemark(driver).clickButton(arg1);
    }

//daily fee collection date wise
    @Then("^user open daily fee collection date wise$")
    public void user_open_daily_fee_collection_date_wise() throws Throwable {
        new DailyFeeCollectionDateWise(driver).openDailyFeeCollectionDateWise();
    }

    @Then("^verify validation when no class is selected on daily fee collection date wise$")
    public void verify_validation_when_no_class_is_selected_on_daily_fee_collection_date_wise() throws Throwable {
        new DailyFeeCollectionDateWise(driver).validateClass();
    }

    @Then("^verify validation when no entry mode is selected on daily fee collection date wise$")
    public void verify_validation_when_no_entry_mode_is_selected_on_daily_fee_collection_date_wise() throws Throwable {
        new DailyFeeCollectionDateWise(driver).validateEntryMode();
    }

    @Then("^verify validation when no pay mode is selected on daily fee collection date wise$")
    public void verify_validation_when_no_pay_mode_is_selected_on_daily_fee_collection_date_wise() throws Throwable {
        new DailyFeeCollectionDateWise(driver).validatePayMode();
    }

    @Then("^verify validation when no bank name is selected on daily fee collection date wise$")
    public void verify_validation_when_no_bank_name_is_selected_on_daily_fee_collection_date_wise() throws Throwable {
        new DailyFeeCollectionDateWise(driver).validateBankName();
    }

    @Then("^verify validation when no head is selected on daily fee collection date wise$")
    public void verify_validation_when_no_head_is_selected_on_daily_fee_collection_date_wise() throws Throwable {
        new DailyFeeCollectionDateWise(driver).validateHead();
    }

    @Then("^verify validation when no date to is selected on daily fee collection date wise$")
    public void verify_validation_when_no_date_to_is_selected_on_daily_fee_collection_date_wise() throws Throwable {
        new DailyFeeCollectionDateWise(driver).validateToDate();
    }

    @Then("^verify validation when no date from is selected on daily fee collection date wise$")
    public void verify_validation_when_no_date_from_is_selected_on_daily_fee_collection_date_wise() throws Throwable {
        new DailyFeeCollectionDateWise(driver).validateDateFrom();
    }

    @Then("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on daily fee collection date wise$")
    public void select_from_date_as_month_year_and_day_on_daily_fee_collection_date_wise(String arg1, String arg2, String arg3) throws Throwable {
        new DailyFeeCollectionDateWise(driver).selectFromDate(arg1, arg2, arg3);
    }

    @Then("^click receipt no range on daily fee collection date wise$")
    public void click_receipt_no_range_on_daily_fee_collection_date_wise() throws Throwable {
        new DailyFeeCollectionDateWise(driver).clickReceiptRange();
    }

    @Then("^enter value \"([^\"]*)\" in receipt from on daily fee collection date wise$")
    public void enter_value_in_receipt_from_on_daily_fee_collection_date_wise(String arg1) throws Throwable {
        new DailyFeeCollectionDateWise(driver).enterReceiptFrom(arg1);
        new DailyFeeCollectionDateWise(driver).pressEnterInReceiptFrom();
    }

    @Then("^verify numeric validation for receipt from on daily fee collection date wise$")
    public void verify_numeric_validation_for_receipt_from_on_daily_fee_collection_date_wise() throws Throwable {
        new DailyFeeCollectionDateWise(driver).validateReceiptFromMessage();
    }

    @Then("^enter \"([^\"]*)\" digits in receipt from on daily fee collection date wise$")
    public void enter_digits_in_receipt_from_on_daily_fee_collection_date_wise(int arg1) throws Throwable {
        new DailyFeeCollectionDateWise(driver).enterReceiptFrom(arg1);
        new DailyFeeCollectionDateWise(driver).pressEnterInReceiptFrom();
    }

    @Then("^verify length validation on receipt from on daily fee collection date wise$")
    public void verify_length_validation_on_receipt_from_on_daily_fee_collection_date_wise() throws Throwable {
        new DailyFeeCollectionDateWise(driver).validateReceiptFromLength();
    }

    @Then("^enter value \"([^\"]*)\" in receipt to on daily fee collection date wise$")
    public void enter_value_in_receipt_to_on_daily_fee_collection_date_wise(String arg1) throws Throwable {
        new DailyFeeCollectionDateWise(driver).enterReceiptTo(arg1);
        new DailyFeeCollectionDateWise(driver).pressEnterReceiptTo();
    }

    @Then("^verify numeric validation for receipt to on daily fee collection date wise$")
    public void verify_numeric_validation_for_receipt_to_on_daily_fee_collection_date_wise() throws Throwable {
        new DailyFeeCollectionDateWise(driver).validateReceiptToMessage();
    }

    @Then("^enter \"([^\"]*)\" digits in receipt to on daily fee collection date wise$")
    public void enter_digits_in_receipt_to_on_daily_fee_collection_date_wise(int arg1) throws Throwable {
        new DailyFeeCollectionDateWise(driver).enterReceiptTo(arg1);
        new DailyFeeCollectionDateWise(driver).pressEnterReceiptTo();
    }

    @Then("^verify length validation on receipt to on daily fee collection date wise$")
    public void verify_length_validation_on_receipt_to_on_daily_fee_collection_date_wise() throws Throwable {
        new DailyFeeCollectionDateWise(driver).validateReceiptToLength();
    }

    @When("^select to date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on daily fee collection date wise$")
    public void select_to_date_as_month_year_and_day_on_daily_fee_collection_date_wise(String arg1, String arg2, String arg3) throws Throwable {
        new DailyFeeCollectionDateWise(driver).selectToDate(arg1, arg2, arg3);
    }

    @When("^click show on daily fee collection date wise$")
    public void click_show_on_daily_fee_collection_date_wise() throws Throwable {
        new DailyFeeCollectionDateWise(driver).clickShow();
    }

    @Then("^verify alert message for date on daily fee collection date wise$")
    public void verify_alert_message_for_date_on_daily_fee_collection_date_wise() throws Throwable {
        new DailyFeeCollectionDateWise(driver).validateDateAlertMessage();
    }

    @Then("^verify alert message for blank receipt from on daily fee collection date wise$")
    public void verify_alert_message_for_blank_receipt_from_on_daily_fee_collection_date_wise() throws Throwable {
        new DailyFeeCollectionDateWise(driver).validateBlankReceiptFromAlertMessage();
    }

    @Then("^verify alert message for blank receipt to on daily fee collection date wise$")
    public void verify_alert_message_for_blank_receipt_to_on_daily_fee_collection_date_wise() throws Throwable {
        new DailyFeeCollectionDateWise(driver).validateBlankReceiptToAlertMessage();
    }

    @Then("^verify alert message for invalid receipt range on daily fee collection date wise$")
    public void verify_alert_message_for_invalid_receipt_range_on_daily_fee_collection_date_wise() throws Throwable {
        new DailyFeeCollectionDateWise(driver).validateInvalidReceiptRangeAlertMessage();
    }

    @Then("^select school with index \"([^\"]*)\" on daily fee collection date wise$")
    public void select_school_with_index_on_daily_fee_collection_date_wise(int arg1) throws Throwable {
        new DailyFeeCollectionDateWise(driver).selectSchool(arg1);
    }

    @Then("^select wing with index \"([^\"]*)\" on daily fee collection date wise$")
    public void select_wing_with_index_on_daily_fee_collection_date_wise(int arg1) throws Throwable {
        new DailyFeeCollectionDateWise(driver).selectWing(arg1);
    }

    @Then("^select class on daily fee collection date wise$")
    public void select_class_on_daily_fee_collection_date_wise() throws Throwable {
        new DailyFeeCollectionDateWise(driver).selectClass();
    }

    @Then("^select board with index \"([^\"]*)\" on daily fee collection date wise$")
    public void select_board_with_index_on_daily_fee_collection_date_wise(int arg1) throws Throwable {
        new DailyFeeCollectionDateWise(driver).selectBoard(arg1);
    }

    @Then("^select entry mode on daily fee collection date wise$")
    public void select_entry_mode_on_daily_fee_collection_date_wise() throws Throwable {
        new DailyFeeCollectionDateWise(driver).selectEntryMode();
    }

    @Then("^select fee type with index \"([^\"]*)\" on daily fee collection date wise$")
    public void select_fee_type_with_index_on_daily_fee_collection_date_wise(int arg1) throws Throwable {
        new DailyFeeCollectionDateWise(driver).selectFeeType(arg1);
    }

    @Then("^select pay mode on daily fee collection date wise$")
    public void select_pay_mode_on_daily_fee_collection_date_wise() throws Throwable {
        new DailyFeeCollectionDateWise(driver).selectPayMode();
    }

    @Then("^select bank name on daily fee collection date wise$")
    public void select_bank_name_on_daily_fee_collection_date_wise() throws Throwable {
        new DailyFeeCollectionDateWise(driver).selectBankName();
    }

    @Then("^select head on daily fee collection date wise$")
    public void select_head_on_daily_fee_collection_date_wise() throws Throwable {
        new DailyFeeCollectionDateWise(driver).selectHead();
    }

    @Then("^select cheque details on daily fee collection date wise$")
    public void select_cheque_details_on_daily_fee_collection_date_wise() throws Throwable {
        new DailyFeeCollectionDateWise(driver).selectChequeDetails();
    }

    @Then("^select other details on daily fee collection date wise$")
    public void select_other_details_on_daily_fee_collection_date_wise() throws Throwable {
        new DailyFeeCollectionDateWise(driver).selectOtherDetails();
    }

    @Then("^select user with index \"([^\"]*)\" on daily fee collection date wise$")
    public void select_user_with_index_on_daily_fee_collection_date_wise(int arg1) throws Throwable {
        new DailyFeeCollectionDateWise(driver).selectUser(arg1);
    }

    @Then("^click settlement date on daily fee collection date wise$")
    public void click_settlement_date_on_daily_fee_collection_date_wise() throws Throwable {
        new DailyFeeCollectionDateWise(driver).clickSettlementDate();
    }

    @Then("^click cheque clearance date on daily fee collection date wise$")
    public void click_cheque_clearance_date_on_daily_fee_collection_date_wise() throws Throwable {
        new DailyFeeCollectionDateWise(driver).clickChequeClearanceDate();
    }

//daily fee collection account wise
    @Then("^user open daily fee collection account wise$")
    public void user_open_daily_fee_collection_account_wise() throws Throwable {
        new DailyFeeCollectionAccountWise(driver).openDailyFeeCollectionDateWise();
    }

    @Then("^verify validation when no class is selected on daily fee collection account wise$")
    public void verify_validation_when_no_class_is_selected_on_daily_fee_collection_account_wise() throws Throwable {
        new DailyFeeCollectionAccountWise(driver).validateClass();
    }

    @Then("^verify validation when no entry mode is selected on daily fee collection account wise$")
    public void verify_validation_when_no_entry_mode_is_selected_on_daily_fee_collection_account_wise() throws Throwable {
        new DailyFeeCollectionAccountWise(driver).validateEntryMode();
    }

    @Then("^verify validation when no pay mode is selected on daily fee collection account wise$")
    public void verify_validation_when_no_pay_mode_is_selected_on_daily_fee_collection_account_wise() throws Throwable {
        new DailyFeeCollectionAccountWise(driver).validatePayMode();
    }

    @Then("^verify validation when no bank name is selected on daily fee collection account wise$")
    public void verify_validation_when_no_bank_name_is_selected_on_daily_fee_collection_account_wise() throws Throwable {
        new DailyFeeCollectionAccountWise(driver).validateBankName();
    }

    @Then("^verify validation when no head is selected on daily fee collection account wise$")
    public void verify_validation_when_no_head_is_selected_on_daily_fee_collection_account_wise() throws Throwable {
        new DailyFeeCollectionAccountWise(driver).validateHead();
    }

    @Then("^verify validation when no date from is selected on daily fee collection account wise$")
    public void verify_validation_when_no_date_from_is_selected_on_daily_fee_collection_account_wise() throws Throwable {
        new DailyFeeCollectionAccountWise(driver).validateDateFrom();
    }

    @Then("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on daily fee collection account wise$")
    public void select_from_date_as_month_year_and_day_on_daily_fee_collection_account_wise(String arg1, String arg2, String arg3) throws Throwable {
        new DailyFeeCollectionAccountWise(driver).selectFromDate(arg1, arg2, arg3);
    }

    @Then("^verify validation when no date to is selected on daily fee collection account wise$")
    public void verify_validation_when_no_date_to_is_selected_on_daily_fee_collection_account_wise() throws Throwable {
        new DailyFeeCollectionAccountWise(driver).validateToDate();
    }

    @Then("^click receipt no range on daily fee collection account wise$")
    public void click_receipt_no_range_on_daily_fee_collection_account_wise() throws Throwable {
        new DailyFeeCollectionAccountWise(driver).clickReceiptRange();
    }

    @Then("^enter value \"([^\"]*)\" in receipt from on daily fee collection account wise$")
    public void enter_value_in_receipt_from_on_daily_fee_collection_account_wise(String arg1) throws Throwable {
        new DailyFeeCollectionAccountWise(driver).enterReceiptFrom(arg1);
        new DailyFeeCollectionAccountWise(driver).pressEnterInReceiptFrom();
    }

    @Then("^verify numeric validation for receipt from on daily fee collection account wise$")
    public void verify_numeric_validation_for_receipt_from_on_daily_fee_collection_account_wise() throws Throwable {
        new DailyFeeCollectionAccountWise(driver).validateReceiptFromMessage();
    }

    @Then("^enter \"([^\"]*)\" digits in receipt from on daily fee collection account wise$")
    public void enter_digits_in_receipt_from_on_daily_fee_collection_account_wise(int arg1) throws Throwable {
        new DailyFeeCollectionAccountWise(driver).enterReceiptFrom(arg1);
        new DailyFeeCollectionAccountWise(driver).pressEnterInReceiptFrom();
    }

    @Then("^verify length validation on receipt from on daily fee collection account wise$")
    public void verify_length_validation_on_receipt_from_on_daily_fee_collection_account_wise() throws Throwable {
        new DailyFeeCollectionAccountWise(driver).validateReceiptFromLength();
    }

    @Then("^enter value \"([^\"]*)\" in receipt to on daily fee collection account wise$")
    public void enter_value_in_receipt_to_on_daily_fee_collection_account_wise(String arg1) throws Throwable {
        new DailyFeeCollectionAccountWise(driver).enterReceiptTo(arg1);
        new DailyFeeCollectionAccountWise(driver).pressEnterReceiptTo();
    }

    @Then("^verify numeric validation for receipt to on daily fee collection account wise$")
    public void verify_numeric_validation_for_receipt_to_on_daily_fee_collection_account_wise() throws Throwable {
        new DailyFeeCollectionAccountWise(driver).validateReceiptToMessage();
    }

    @Then("^enter \"([^\"]*)\" digits in receipt to on daily fee collection account wise$")
    public void enter_digits_in_receipt_to_on_daily_fee_collection_account_wise(int arg1) throws Throwable {
        new DailyFeeCollectionAccountWise(driver).enterReceiptTo(arg1);
        new DailyFeeCollectionAccountWise(driver).pressEnterReceiptTo();
    }

    @Then("^verify length validation on receipt to on daily fee collection account wise$")
    public void verify_length_validation_on_receipt_to_on_daily_fee_collection_account_wise() throws Throwable {
        new DailyFeeCollectionAccountWise(driver).validateReceiptToLength();
    }

    @When("^select to date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on daily fee collection account wise$")
    public void select_to_date_as_month_year_and_day_on_daily_fee_collection_account_wise(String arg1, String arg2, String arg3) throws Throwable {
        new DailyFeeCollectionAccountWise(driver).selectToDate(arg1, arg2, arg3);
    }

    @When("^click show on daily fee collection account wise$")
    public void click_show_on_daily_fee_collection_account_wise() throws Throwable {
        new DailyFeeCollectionAccountWise(driver).clickShow();
    }

    @Then("^verify alert message for account on daily fee collection account wise$")
    public void verify_alert_message_for_account_on_daily_fee_collection_account_wise() throws Throwable {
        new DailyFeeCollectionAccountWise(driver).validateDateAlertMessage();
    }

    @Then("^verify alert message for blank receipt from on daily fee collection account wise$")
    public void verify_alert_message_for_blank_receipt_from_on_daily_fee_collection_account_wise() throws Throwable {
        new DailyFeeCollectionAccountWise(driver).validateBlankReceiptFromAlertMessage();
    }

    @Then("^verify alert message for blank receipt to on daily fee collection account wise$")
    public void verify_alert_message_for_blank_receipt_to_on_daily_fee_collection_account_wise() throws Throwable {
        new DailyFeeCollectionAccountWise(driver).validateBlankReceiptToAlertMessage();
    }

    @Then("^verify alert message for invalid receipt range on daily fee collection account wise$")
    public void verify_alert_message_for_invalid_receipt_range_on_daily_fee_collection_account_wise() throws Throwable {
        new DailyFeeCollectionAccountWise(driver).validateInvalidReceiptRangeAlertMessage();
    }

    @Then("^select school with index \"([^\"]*)\" on daily fee collection account wise$")
    public void select_school_with_index_on_daily_fee_collection_account_wise(int arg1) throws Throwable {
        new DailyFeeCollectionAccountWise(driver).selectSchool(arg1);
    }

    @Then("^select wing with index \"([^\"]*)\" on daily fee collection account wise$")
    public void select_wing_with_index_on_daily_fee_collection_account_wise(int arg1) throws Throwable {
        new DailyFeeCollectionAccountWise(driver).selectWing(arg1);
    }

    @Then("^select class on daily fee collection account wise$")
    public void select_class_on_daily_fee_collection_account_wise() throws Throwable {
        new DailyFeeCollectionAccountWise(driver).selectClass();
    }

    @Then("^select board with index \"([^\"]*)\" on daily fee collection account wise$")
    public void select_board_with_index_on_daily_fee_collection_account_wise(int arg1) throws Throwable {
        new DailyFeeCollectionAccountWise(driver).selectBoard(arg1);
    }

    @Then("^select entry mode on daily fee collection account wise$")
    public void select_entry_mode_on_daily_fee_collection_account_wise() throws Throwable {
        new DailyFeeCollectionAccountWise(driver).selectEntryMode();
    }

    @Then("^select fee type with index \"([^\"]*)\" on daily fee collection account wise$")
    public void select_fee_type_with_index_on_daily_fee_collection_account_wise(int arg1) throws Throwable {
        new DailyFeeCollectionAccountWise(driver).selectFeeType(arg1);
    }

    @Then("^select pay mode on daily fee collection account wise$")
    public void select_pay_mode_on_daily_fee_collection_account_wise() throws Throwable {
        new DailyFeeCollectionAccountWise(driver).selectPayMode();
    }

    @Then("^select head on daily fee collection account wise$")
    public void select_head_on_daily_fee_collection_account_wise() throws Throwable {
        new DailyFeeCollectionAccountWise(driver).selectHead();
    }

    @Then("^select bank name on daily fee collection account wise$")
    public void select_bank_name_on_daily_fee_collection_account_wise() throws Throwable {
        new DailyFeeCollectionAccountWise(driver).selectBankName();
    }

    @Then("^select cheque details on daily fee collection account wise$")
    public void select_cheque_details_on_daily_fee_collection_account_wise() throws Throwable {
        new DailyFeeCollectionAccountWise(driver).selectChequeDetails();
    }

    @Then("^select user with index \"([^\"]*)\" on daily fee collection account wise$")
    public void select_user_with_index_on_daily_fee_collection_account_wise(int arg1) throws Throwable {
        new DailyFeeCollectionAccountWise(driver).selectUser(arg1);
    }

    @Then("^select radio button \"([^\"]*)\" on daily fee collection account wise$")
    public void select_radio_button_on_daily_fee_collection_account_wise(String arg1) throws Throwable {
        new DailyFeeCollectionAccountWise(driver).clickButton(arg1);
    }

    @Then("^click cheque clearing date on daily fee collection account wise$")
    public void click_cheque_clearing_date_on_daily_fee_collection_account_wise() throws Throwable {
        new DailyFeeCollectionAccountWise(driver).clickChequeClearanceDate();
    }

//daily fee collection date fee group wise
    @Then("^user open daily fee collection date fee group wise$")
    public void user_open_daily_fee_collection_date_fee_group_wise() throws Throwable {
        new DailyFeeCollectionDateFeeGroupWise(driver).openDailyFeeCollectionDateFeeGroupWise();
    }

    @Then("^verify validation when no class is selected on daily fee collection date fee group wise$")
    public void verify_validation_when_no_class_is_selected_on_daily_fee_collection_date_fee_group_wise() throws Throwable {
        new DailyFeeCollectionDateFeeGroupWise(driver).validateClass();
    }

    @Then("^verify validation when no entry mode is selected on daily fee collection date fee group wise$")
    public void verify_validation_when_no_entry_mode_is_selected_on_daily_fee_collection_date_fee_group_wise() throws Throwable {
        new DailyFeeCollectionDateFeeGroupWise(driver).validateEntryMode();
    }

    @Then("^verify validation when no pay mode is selected on daily fee collection date fee group wise$")
    public void verify_validation_when_no_pay_mode_is_selected_on_daily_fee_collection_date_fee_group_wise() throws Throwable {
        new DailyFeeCollectionDateFeeGroupWise(driver).validatePayMode();
    }

    @Then("^verify validation when no fee head is selected on daily fee collection date fee group wise$")
    public void verify_validation_when_no_fee_head_is_selected_on_daily_fee_collection_date_fee_group_wise() throws Throwable {
        new DailyFeeCollectionDateFeeGroupWise(driver).validateHead();
    }

    @Then("^verify validation when no fee group is selected on daily fee collection date fee group wise$")
    public void verify_validation_when_no_fee_group_is_selected_on_daily_fee_collection_date_fee_group_wise() throws Throwable {
        new DailyFeeCollectionDateFeeGroupWise(driver).validateFeeGroup();
    }

    @Then("^verify validation when no date from is selected on daily fee collection date fee group wise$")
    public void verify_validation_when_no_date_from_is_selected_on_daily_fee_collection_date_fee_group_wise() throws Throwable {
        new DailyFeeCollectionDateFeeGroupWise(driver).validateDateFrom();
    }

    @Then("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on daily fee collection date fee group wise$")
    public void select_from_date_as_month_year_and_day_on_daily_fee_collection_date_fee_group_wise(String arg1, String arg2, String arg3) throws Throwable {
        new DailyFeeCollectionDateFeeGroupWise(driver).selectFromDate(arg1, arg2, arg3);
    }

    @Then("^verify validation when no date to is selected on daily fee collection date fee group wise$")
    public void verify_validation_when_no_date_to_is_selected_on_daily_fee_collection_date_fee_group_wise() throws Throwable {
        new DailyFeeCollectionDateFeeGroupWise(driver).validateToDate();
    }

    @When("^select to date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on daily fee collection date fee group wise$")
    public void select_to_date_as_month_year_and_day_on_daily_fee_collection_date_fee_group_wise(String arg1, String arg2, String arg3) throws Throwable {
        new DailyFeeCollectionDateFeeGroupWise(driver).selectToDate(arg1, arg2, arg3);
    }

    @When("^click show on daily fee collection date fee group wise$")
    public void click_show_on_daily_fee_collection_date_fee_group_wise() throws Throwable {
        new DailyFeeCollectionDateFeeGroupWise(driver).clickShow();
    }

    @Then("^verify alert message for account on daily fee collection date fee group wise$")
    public void verify_alert_message_for_account_on_daily_fee_collection_date_fee_group_wise() throws Throwable {
        new DailyFeeCollectionDateFeeGroupWise(driver).validateDateAlertMessage();
    }

    @Then("^select school with index \"([^\"]*)\" on daily fee collection date fee group wise$")
    public void select_school_with_index_on_daily_fee_collection_date_fee_group_wise(int arg1) throws Throwable {
        new DailyFeeCollectionDateFeeGroupWise(driver).selectSchool(arg1);
    }

    @Then("^select wing with index \"([^\"]*)\" on daily fee collection date fee group wise$")
    public void select_wing_with_index_on_daily_fee_collection_date_fee_group_wise(int arg1) throws Throwable {
        new DailyFeeCollectionDateFeeGroupWise(driver).selectWing(arg1);
    }

    @Then("^select class on daily fee collection date fee group wise$")
    public void select_class_on_daily_fee_collection_date_fee_group_wise() throws Throwable {
        new DailyFeeCollectionDateFeeGroupWise(driver).selectClass();
    }

    @Then("^select board with index \"([^\"]*)\" on daily fee collection date fee group wise$")
    public void select_board_with_index_on_daily_fee_collection_date_fee_group_wise(int arg1) throws Throwable {
        new DailyFeeCollectionDateFeeGroupWise(driver).selectBoard(arg1);
    }

    @Then("^select entry mode on daily fee collection date fee group wise$")
    public void select_entry_mode_on_daily_fee_collection_date_fee_group_wise() throws Throwable {
        new DailyFeeCollectionDateFeeGroupWise(driver).selectEntryMode();
    }

    @Then("^select pay mode on daily fee collection date fee group wise$")
    public void select_pay_mode_on_daily_fee_collection_date_fee_group_wise() throws Throwable {
        new DailyFeeCollectionDateFeeGroupWise(driver).selectPayMode();
    }

    @Then("^select fee type with index \"([^\"]*)\" on daily fee collection date fee group wise$")
    public void select_fee_type_with_index_on_daily_fee_collection_date_fee_group_wise(int arg1) throws Throwable {
        new DailyFeeCollectionDateFeeGroupWise(driver).selectFeeType(arg1);
    }

    @Then("^select head on daily fee collection date fee group wise$")
    public void select_head_on_daily_fee_collection_date_fee_group_wise() throws Throwable {
        new DailyFeeCollectionDateFeeGroupWise(driver).selectHead();
    }

    @Then("^select fee group on daily fee collection date fee group wise$")
    public void select_fee_group_on_daily_fee_collection_date_fee_group_wise() throws Throwable {
        new DailyFeeCollectionDateFeeGroupWise(driver).selectFeeGroup();
    }

    @Then("^select user with index \"([^\"]*)\" on daily fee collection date fee group wise$")
    public void select_user_with_index_on_daily_fee_collection_date_fee_group_wise(int arg1) throws Throwable {
        new DailyFeeCollectionDateFeeGroupWise(driver).selectUser(arg1);
    }

    @Then("^select radio button \"([^\"]*)\" on daily fee collection date fee group wise$")
    public void select_radio_button_on_daily_fee_collection_date_fee_group_wise(String arg1) throws Throwable {
        new DailyFeeCollectionDateFeeGroupWise(driver).clickButton(arg1);
    }

    @Then("^select with settlement date on daily fee collection date fee group wise$")
    public void select_with_settlement_date_on_daily_fee_collection_date_fee_group_wise() throws Throwable {
        new DailyFeeCollectionDateFeeGroupWise(driver).clickSettlementDate();
    }

    @Then("^select with cheque clearance date on daily fee collection date fee group wise$")
    public void select_with_cheque_clearance_date_on_daily_fee_collection_date_fee_group_wise() throws Throwable {
        new DailyFeeCollectionDateFeeGroupWise(driver).clickChequeClearanceDate();
    }

//day wise total collection
    @Then("^user open day wise total collection$")
    public void user_open_day_wise_total_collection() throws Throwable {
        new DayWiseTotalCollection(driver).openDailyFeeCollectionDateWise();
    }

    @Then("^verify validation when no class is selected on day wise total collection$")
    public void verify_validation_when_no_class_is_selected_on_day_wise_total_collection() throws Throwable {
        new DayWiseTotalCollection(driver).validateClass();
    }

    @Then("^verify validation when no entry mode is selected on day wise total collection$")
    public void verify_validation_when_no_entry_mode_is_selected_on_day_wise_total_collection() throws Throwable {
        new DayWiseTotalCollection(driver).validateEntryMode();
    }

    @Then("^verify validation when no pay mode is selected on day wise total collection$")
    public void verify_validation_when_no_pay_mode_is_selected_on_day_wise_total_collection() throws Throwable {
        new DayWiseTotalCollection(driver).validatePayMode();
    }

    @Then("^verify validation when no fee head is selected on day wise total collection$")
    public void verify_validation_when_no_fee_head_is_selected_on_day_wise_total_collection() throws Throwable {
        new DayWiseTotalCollection(driver).validateHead();
    }

    @Then("^verify validation when no installment is selected on day wise total collection$")
    public void verify_validation_when_no_installment_is_selected_on_day_wise_total_collection() throws Throwable {
        new DayWiseTotalCollection(driver).validateInstallment();
    }

    @Then("^verify validation when no month is selected on day wise total collection$")
    public void verify_validation_when_no_month_is_selected_on_day_wise_total_collection() throws Throwable {
        new DayWiseTotalCollection(driver).validateMonth();
    }

    @Then("^verify validation when till date is not selected on day wise total collection$")
    public void verify_validation_when_till_date_is_not_selected_on_day_wise_total_collection() throws Throwable {
        new DayWiseTotalCollection(driver).validateTillDate();
    }

    @Then("^select school with index \"([^\"]*)\" on day wise total collection$")
    public void select_school_with_index_on_day_wise_total_collection(int arg1) throws Throwable {
        new DayWiseTotalCollection(driver).selectSchool(arg1);
    }

    @Then("^select wing with index \"([^\"]*)\" on day wise total collection$")
    public void select_wing_with_index_on_day_wise_total_collection(int arg1) throws Throwable {
        new DayWiseTotalCollection(driver).selectWing(arg1);
    }

    @Then("^select class on day wise total collection$")
    public void select_class_on_day_wise_total_collection() throws Throwable {
        new DayWiseTotalCollection(driver).selectClass();
    }

    @Then("^select board with index \"([^\"]*)\" on day wise total collection$")
    public void select_board_with_index_on_day_wise_total_collection(int arg1) throws Throwable {
        new DayWiseTotalCollection(driver).selectBoard(arg1);
    }

    @Then("^select entry mode on day wise total collection$")
    public void select_entry_mode_on_day_wise_total_collection() throws Throwable {
        new DayWiseTotalCollection(driver).selectEntryMode();
    }

    @Then("^select pay mode on day wise total collection$")
    public void select_pay_mode_on_day_wise_total_collection() throws Throwable {
        new DayWiseTotalCollection(driver).selectPayMode();
    }

    @Then("^select fee type with index \"([^\"]*)\" on fees cheque bounce report$")
    public void select_fee_type_with_index_on_fees_cheque_bounce_report(int arg1) throws Throwable {
        new DayWiseTotalCollection(driver).selectFeeType(arg1);
    }

    @Then("^select head on day wise total collection$")
    public void select_head_on_day_wise_total_collection() throws Throwable {
        new DayWiseTotalCollection(driver).selectHead();
    }

    @Then("^select installment on day wise total collection$")
    public void select_installment_on_day_wise_total_collection() throws Throwable {
        new DayWiseTotalCollection(driver).selectInstallment();
    }

    @Then("^select month on day wise total collection$")
    public void select_month_on_day_wise_total_collection() throws Throwable {
        new DayWiseTotalCollection(driver).selectMonth();
    }

    @Then("^select user with index \"([^\"]*)\" on day wise total collection$")
    public void select_user_with_index_on_day_wise_total_collection(int arg1) throws Throwable {
        new DayWiseTotalCollection(driver).selectUser(arg1);
    }

    @Then("^click show on day wise total collection$")
    public void click_show_on_day_wise_total_collection() throws Throwable {
        new DayWiseTotalCollection(driver).clickShow();
    }

//estimated collection report
    @Then("^user open estimated collection report$")
    public void user_open_estimated_collection_report() throws Throwable {
        new EstimatedCollectionReport(driver).openEstimatedCollectionReport();
    }

    @Then("^verify validation when no class is selected on estimated collection report$")
    public void verify_validation_when_no_class_is_selected_on_estimated_collection_report() throws Throwable {
        new EstimatedCollectionReport(driver).validateClass();
    }

    @Then("^verify validation when no installment is selected on estimated collection report$")
    public void verify_validation_when_no_installment_is_selected_on_estimated_collection_report() throws Throwable {
        new EstimatedCollectionReport(driver).validateInstallment();
    }

    @Then("^verify validation when till date is not selected on estimated collection report$")
    public void verify_validation_when_till_date_is_not_selected_on_estimated_collection_report() throws Throwable {
        new EstimatedCollectionReport(driver).validateTillDate();
    }

    @Then("^select school with index \"([^\"]*)\" on estimated collection report$")
    public void select_school_with_index_on_estimated_collection_report(int arg1) throws Throwable {
        new EstimatedCollectionReport(driver).selectSchool(arg1);
    }

    @Then("^select wing with index \"([^\"]*)\" on estimated collection report$")
    public void select_wing_with_index_on_estimated_collection_report(int arg1) throws Throwable {
        new EstimatedCollectionReport(driver).selectWing(arg1);
    }

    @Then("^select class on estimated collection report$")
    public void select_class_on_estimated_collection_report() throws Throwable {
        new EstimatedCollectionReport(driver).selectClass();
    }

    @Then("^select board with index \"([^\"]*)\" on estimated collection report$")
    public void select_board_with_index_on_estimated_collection_report(int arg1) throws Throwable {
        new EstimatedCollectionReport(driver).selectBoard(arg1);
    }

    @Then("^select fee type with index \"([^\"]*)\" on estimated collection report$")
    public void select_fee_type_with_index_on_estimated_collection_report(int arg1) throws Throwable {
        new EstimatedCollectionReport(driver).selectFeeType(arg1);
    }

    @Then("^select installment on estimated collection report$")
    public void select_installment_on_estimated_collection_report() throws Throwable {
        new EstimatedCollectionReport(driver).selectInstallment();
    }

    @Then("^select user with index \"([^\"]*)\" on estimated collection report$")
    public void select_user_with_index_on_estimated_collection_report(int arg1) throws Throwable {
        new EstimatedCollectionReport(driver).selectUser(arg1);
    }

    @Then("^select report type with index \"([^\"]*)\" on estimated collection report$")
    public void select_report_type_with_index_on_estimated_collection_report(int arg1) throws Throwable {
        new EstimatedCollectionReport(driver).selectReportType(arg1);
    }

    @Then("^click show on estimated collection report$")
    public void click_show_on_estimated_collection_report() throws Throwable {
        new EstimatedCollectionReport(driver).clickShow();
    }

    @Then("^verify validation when no class is selected on fee head wise collection class range$")
    public void verify_validation_when_no_class_is_selected_on_fee_head_wise_collection_class_range() throws Throwable {
        new FeeHeadWiseCollectionClassRange(driver).validateClass();
    }

    @Then("^verify validation when no entry mode is selected on fee head wise collection class range$")
    public void verify_validation_when_no_entry_mode_is_selected_on_fee_head_wise_collection_class_range() throws Throwable {
        new FeeHeadWiseCollectionClassRange(driver).validateEntryMode();
    }

    @Then("^verify validation when no pay mode is selected on fee head wise collection class range$")
    public void verify_validation_when_no_pay_mode_is_selected_on_fee_head_wise_collection_class_range() throws Throwable {
        new FeeHeadWiseCollectionClassRange(driver).validatePayMode();
    }

    @Then("^verify validation when head is not selected on fee head wise collection class range$")
    public void verify_validation_when_head_is_not_selected_on_fee_head_wise_collection_class_range() throws Throwable {
        new FeeHeadWiseCollectionClassRange(driver).validateHead();
    }

    @Then("^verify validation when no date from is selected on fee head wise collection class range$")
    public void verify_validation_when_no_date_from_is_selected_on_fee_head_wise_collection_class_range() throws Throwable {
        new FeeHeadWiseCollectionClassRange(driver).validateDateFrom();
    }

    @Then("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on fee head wise collection class range$")
    public void select_from_date_as_month_year_and_day_on_fee_head_wise_collection_class_range(String arg1, String arg2, String arg3) throws Throwable {
        new FeeHeadWiseCollectionClassRange(driver).selectFromDate(arg1, arg2, arg3);
    }

    @When("^select to date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on fee head wise collection class range$")
    public void select_to_date_as_month_year_and_day_on_fee_head_wise_collection_class_range(String arg1, String arg2, String arg3) throws Throwable {
        new FeeHeadWiseCollectionClassRange(driver).selectToDate(arg1, arg2, arg3);
    }

    @Then("^verify validation when no date to is selected on fee head wise collection class range$")
    public void verify_validation_when_no_date_to_is_selected_on_fee_head_wise_collection_class_range() throws Throwable {
        new FeeHeadWiseCollectionClassRange(driver).validateToDate();
    }

    @When("^click show on fee head wise collection class range$")
    public void click_show_on_fee_head_wise_collection_class_range() throws Throwable {
        new FeeHeadWiseCollectionClassRange(driver).clickShow();
    }

    @Then("^verify alert message for date on fee head wise collection class range$")
    public void verify_alert_message_for_date_on_fee_head_wise_collection_class_range() throws Throwable {
        new FeeHeadWiseCollectionClassRange(driver).validateDateAlertMessage();
    }

    @Then("^select school with index \"([^\"]*)\" on fee head wise collection class range$")
    public void select_school_with_index_on_fee_head_wise_collection_class_range(int arg1) throws Throwable {
        new FeeHeadWiseCollectionClassRange(driver).selectSchool(arg1);
    }

    @Then("^select wing with index \"([^\"]*)\" on fee head wise collection class range$")
    public void select_wing_with_index_on_fee_head_wise_collection_class_range(int arg1) throws Throwable {
        new FeeHeadWiseCollectionClassRange(driver).selectWing(arg1);
    }

    @Then("^select class on fee head wise collection class range$")
    public void select_class_on_fee_head_wise_collection_class_range() throws Throwable {
        new FeeHeadWiseCollectionClassRange(driver).selectClass();
    }

    @Then("^select board with index \"([^\"]*)\" on fee head wise collection class range$")
    public void select_board_with_index_on_fee_head_wise_collection_class_range(int arg1) throws Throwable {
        new FeeHeadWiseCollectionClassRange(driver).selectBoard(arg1);
    }

    @Then("^select entry mode on fee head wise collection class range$")
    public void select_entry_mode_on_fee_head_wise_collection_class_range() throws Throwable {
        new FeeHeadWiseCollectionClassRange(driver).selectEntryMode();
    }

    @Then("^user open fee head wise collection class range$")
    public void user_open_fee_head_wise_collection_class_range() throws Throwable {
        new FeeHeadWiseCollectionClassRange(driver).openFeeHeadWiseCollectionClassRange();
    }

    @Then("^select fee type with index \"([^\"]*)\" on fee head wise collection class range$")
    public void select_fee_type_with_index_on_fee_head_wise_collection_class_range(int arg1) throws Throwable {
        new FeeHeadWiseCollectionClassRange(driver).selectFeeType(arg1);
    }

    @Then("^select pay mode on fee head wise collection class range$")
    public void select_pay_mode_on_fee_head_wise_collection_class_range() throws Throwable {
        new FeeHeadWiseCollectionClassRange(driver).selectPayMode();
    }

    @Then("^select head on fee head wise collection class range$")
    public void select_head_on_fee_head_wise_collection_class_range() throws Throwable {
        new FeeHeadWiseCollectionClassRange(driver).selectHead();
    }

    @Then("^select user with index \"([^\"]*)\" on fee head wise collection class range$")
    public void select_user_with_index_on_fee_head_wise_collection_class_range(int arg1) throws Throwable {
        new FeeHeadWiseCollectionClassRange(driver).selectUser(arg1);
    }

    @Then("^click settlement date on fee head wise collection class range$")
    public void click_settlement_date_on_fee_head_wise_collection_class_range() throws Throwable {
        new FeeHeadWiseCollectionClassRange(driver).clickSettlementDate();
    }

    @Then("^click cheque clearance date on fee head wise collection class range$")
    public void click_cheque_clearance_date_on_fee_head_wise_collection_class_range() throws Throwable {
        new FeeHeadWiseCollectionClassRange(driver).clickChequeClearanceDate();
    }

//student wise collection report
    @When("^user open student wise collection report$")
    public void user_open_student_wise_collection_report() throws Throwable {
        new StudentWiseCollectionReport(driver).openStudentWiseCollectionReport();
    }

    @Then("^verify validation when no class is selected on student wise collection report$")
    public void verify_validation_when_no_class_is_selected_on_student_wise_collection_report() throws Throwable {
        new StudentWiseCollectionReport(driver).validateClass();
    }

    @When("^select school with index \"([^\"]*)\" on student wise collection report$")
    public void select_school_with_index_on_student_wise_collection_report(int arg1) throws Throwable {
        new StudentWiseCollectionReport(driver).selectSchool(arg1);
    }

    @When("^select class on student wise collection report$")
    public void select_class_on_student_wise_collection_report() throws Throwable {
        new StudentWiseCollectionReport(driver).selectClass();
    }

    @When("^select fee type with index \"([^\"]*)\" on student wise collection report$")
    public void select_fee_type_with_index_on_student_wise_collection_report(int arg1) throws Throwable {
        new StudentWiseCollectionReport(driver).selectFeeType(arg1);
    }

    @When("^click head wise on student wise collection report$")
    public void click_head_wise_on_student_wise_collection_report() throws Throwable {
        new StudentWiseCollectionReport(driver).clickHeadWise();
    }

    @When("^click show on student wise collection report$")
    public void click_show_on_student_wise_collection_report() throws Throwable {
        new StudentWiseCollectionReport(driver).clickShow();
    }

//yearly collection report
    @When("^user open yearly collection report$")
    public void user_open_yearly_collection_report() throws Throwable {
        new YearlyCollectionReport(driver).openYearlyCollectionReport();
    }

    @When("^select session as \"([^\"]*)\" on yearly collection report$")
    public void select_session_as_on_yearly_collection_report(String arg1) throws Throwable {
        new YearlyCollectionReport(driver).selectSession(arg1);
    }

    @When("^verify validation when no session is selected on yearly collection report$")
    public void verify_validation_when_no_session_is_selected_on_yearly_collection_report() throws Throwable {
        new YearlyCollectionReport(driver).validateSession();
    }

    @When("^verify validation when no class is selected on yearly collection report$")
    public void verify_validation_when_no_class_is_selected_on_yearly_collection_report() throws Throwable {
        new YearlyCollectionReport(driver).validateClass();
    }

    @When("^verify validation when no entry mode is selected on yearly collection report$")
    public void verify_validation_when_no_entry_mode_is_selected_on_yearly_collection_report() throws Throwable {
        new YearlyCollectionReport(driver).validateEntryMode();
    }

    @When("^verify validation when no pay mode is selected on yearly collection report$")
    public void verify_validation_when_no_pay_mode_is_selected_on_yearly_collection_report() throws Throwable {
        new YearlyCollectionReport(driver).validatePayMode();
    }

    @When("^verify validation when no head is selected on yearly collection report$")
    public void verify_validation_when_no_head_is_selected_on_yearly_collection_report() throws Throwable {
        new YearlyCollectionReport(driver).validateHead();
    }

    @When("^verify validation when no installment is selected on yearly collection report$")
    public void verify_validation_when_no_installment_is_selected_on_yearly_collection_report() throws Throwable {
        new YearlyCollectionReport(driver).validateInstallment();
    }

    @When("^verify validation when no bank name is selected on yearly collection report$")
    public void verify_validation_when_no_bank_name_is_selected_on_yearly_collection_report() throws Throwable {
        new YearlyCollectionReport(driver).validateBankName();
    }

    @When("^select session with index \"([^\"]*)\" on yearly collection report$")
    public void select_session_with_index_on_yearly_collection_report(int arg1) throws Throwable {
        new YearlyCollectionReport(driver).selectSession(arg1);
    }

    @When("^select school with index \"([^\"]*)\" on yearly collection report$")
    public void select_school_with_index_on_yearly_collection_report(int arg1) throws Throwable {
        new YearlyCollectionReport(driver).selectSchool(arg1);
    }

    @When("^select wing with index \"([^\"]*)\" on yearly collection report$")
    public void select_wing_with_index_on_yearly_collection_report(int arg1) throws Throwable {
        new YearlyCollectionReport(driver).selectWing(arg1);
    }

    @When("^select class on yearly collection report$")
    public void select_class_on_yearly_collection_report() throws Throwable {
        new YearlyCollectionReport(driver).selectClass();
    }

    @When("^select board with index \"([^\"]*)\" on yearly collection report$")
    public void select_board_with_index_on_yearly_collection_report(int arg1) throws Throwable {
        new YearlyCollectionReport(driver).selectBoard(arg1);
    }

    @When("^select entry mode on yearly collection report$")
    public void select_entry_mode_on_yearly_collection_report() throws Throwable {
        new YearlyCollectionReport(driver).selectEntryMode();
    }

    @When("^select pay mode on yearly collection report$")
    public void select_pay_mode_on_yearly_collection_report() throws Throwable {
        new YearlyCollectionReport(driver).selectPayMode();
    }

    @When("^select fee type with index \"([^\"]*)\" on yearly collection report$")
    public void select_fee_type_with_index_on_yearly_collection_report(int arg1) throws Throwable {
        new YearlyCollectionReport(driver).selectFeeType(arg1);
    }

    @When("^select head on yearly collection report$")
    public void select_head_on_yearly_collection_report() throws Throwable {
        new YearlyCollectionReport(driver).selectHead();
    }

    @When("^select installment on yearly collection report$")
    public void select_installment_on_yearly_collection_report() throws Throwable {
        new YearlyCollectionReport(driver).selectInstallment();
    }

    @When("^select bank name on yearly collection report$")
    public void select_bank_name_on_yearly_collection_report() throws Throwable {
        new YearlyCollectionReport(driver).selectBankName();
    }

    @When("^select user with index \"([^\"]*)\" on yearly collection report$")
    public void select_user_with_index_on_yearly_collection_report(int arg1) throws Throwable {
        new YearlyCollectionReport(driver).selectUser(arg1);
    }

    @Then("^click show on yearly collection report$")
    public void click_show_on_yearly_collection_report() throws Throwable {
        new YearlyCollectionReport(driver).clickShow();
    }

    @When("^click month wise collection on yearly collection report$")
    public void click_month_wise_collection_on_yearly_collection_report() throws Throwable {
        new YearlyCollectionReport(driver).clickMonthWiseCollection();
    }

    @When("^click cheque clearing date on yearly collection report$")
    public void click_cheque_clearing_date_on_yearly_collection_report() throws Throwable {
        new YearlyCollectionReport(driver).clickChequeClearanceDate();
    }

//total collection report
    @When("^user open total collection report$")
    public void user_open_total_collection_report() throws Throwable {
        new TotalCollectionReport(driver).openTotalCollectionReport();
    }

    @Then("^verify validation when no class is selected on total collection report$")
    public void verify_validation_when_no_class_is_selected_on_total_collection_report() throws Throwable {
        new TotalCollectionReport(driver).validateClass();
    }

    @When("^select school with index \"([^\"]*)\" on total collection report$")
    public void select_school_with_index_on_total_collection_report(int arg1) throws Throwable {
        new TotalCollectionReport(driver).selectSchool(arg1);
    }

    @When("^select wing with index \"([^\"]*)\" on total collection report$")
    public void select_wing_with_index_on_total_collection_report(int arg1) throws Throwable {
        new TotalCollectionReport(driver).selectWing(arg1);
    }

    @When("^select class on total collection report$")
    public void select_class_on_total_collection_report() throws Throwable {
        new TotalCollectionReport(driver).selectClass();
    }

    @When("^select board with index \"([^\"]*)\" on total collection report$")
    public void select_board_with_index_on_total_collection_report(int arg1) throws Throwable {
        new TotalCollectionReport(driver).selectBoard(arg1);
    }

    @When("^select fee type with index \"([^\"]*)\" on total collection report$")
    public void select_fee_type_with_index_on_total_collection_report(int arg1) throws Throwable {
        new TotalCollectionReport(driver).selectFeeType(arg1);
    }

    @When("^select installment with index \"([^\"]*)\" on total collection report$")
    public void select_installment_with_index_on_total_collection_report(int arg1) throws Throwable {
        new TotalCollectionReport(driver).selectInstallment(arg1);
    }

    @When("^select user with index \"([^\"]*)\" on total collection report$")
    public void select_user_with_index_on_total_collection_report(int arg1) throws Throwable {
        new TotalCollectionReport(driver).selectUser(arg1);
    }

    @Then("^click show on total collection report$")
    public void click_show_on_total_collection_report() throws Throwable {
        new TotalCollectionReport(driver).clickShow();
    }

//monthly consolidated report
    @When("^user open monthly consolidated report$")
    public void user_open_monthly_consolidated_report() throws Throwable {
        new MonthlyConsolidatedReport(driver).openMonthlyConsolidatedReport();
    }

    @When("^verify validation when no class is selected on monthly consolidated report$")
    public void verify_validation_when_no_class_is_selected_on_monthly_consolidated_report() throws Throwable {
        new MonthlyConsolidatedReport(driver).validateClass();
    }

    @When("^verify validation when no entry mode is selected on monthly consolidated report$")
    public void verify_validation_when_no_entry_mode_is_selected_on_monthly_consolidated_report() throws Throwable {
        new MonthlyConsolidatedReport(driver).validateEntryMode();
    }

    @When("^verify validation when no pay mode is selected on monthly consolidated report$")
    public void verify_validation_when_no_pay_mode_is_selected_on_monthly_consolidated_report() throws Throwable {
        new MonthlyConsolidatedReport(driver).validatePayMode();
    }

    @When("^verify validation when no head is selected on monthly consolidated report$")
    public void verify_validation_when_no_head_is_selected_on_monthly_consolidated_report() throws Throwable {
        new MonthlyConsolidatedReport(driver).validateHead();
    }

    @When("^verify validation when no installment is selected on monthly consolidated report$")
    public void verify_validation_when_no_installment_is_selected_on_monthly_consolidated_report() throws Throwable {
        new MonthlyConsolidatedReport(driver).validateInstallment();
    }

    @When("^verify validation when no month is selected on monthly consolidated report$")
    public void verify_validation_when_no_month_is_selected_on_monthly_consolidated_report() throws Throwable {
        new MonthlyConsolidatedReport(driver).validateMonth();
    }

    @When("^verify validation when no bank name is selected on monthly consolidated report$")
    public void verify_validation_when_no_bank_name_is_selected_on_monthly_consolidated_report() throws Throwable {
        new MonthlyConsolidatedReport(driver).validateBankName();
    }

    @When("^verify validation when no cheque bank is selected on monthly consolidated report$")
    public void verify_validation_when_no_cheque_bank_is_selected_on_monthly_consolidated_report() throws Throwable {
        new MonthlyConsolidatedReport(driver).validateChequeBank();
    }

    @When("^select school with index \"([^\"]*)\" on monthly consolidated report$")
    public void select_school_with_index_on_monthly_consolidated_report(int arg1) throws Throwable {
        new MonthlyConsolidatedReport(driver).selectSchool(arg1);
    }

    @When("^select wing with index \"([^\"]*)\" on monthly consolidated report$")
    public void select_wing_with_index_on_monthly_consolidated_report(int arg1) throws Throwable {
        new MonthlyConsolidatedReport(driver).selectWing(arg1);
    }

    @When("^select class on monthly consolidated report$")
    public void select_class_on_monthly_consolidated_report() throws Throwable {
        new MonthlyConsolidatedReport(driver).selectClass();
    }

    @When("^select board with index \"([^\"]*)\" on monthly consolidated report$")
    public void select_board_with_index_on_monthly_consolidated_report(int arg1) throws Throwable {
        new MonthlyConsolidatedReport(driver).selectBoard(arg1);
    }

    @When("^select entry mode on monthly consolidated report$")
    public void select_entry_mode_on_monthly_consolidated_report() throws Throwable {
        new MonthlyConsolidatedReport(driver).selectEntryMode();
    }

    @When("^select fee type with index \"([^\"]*)\" on monthly consolidated report$")
    public void select_fee_type_with_index_on_monthly_consolidated_report(int arg1) throws Throwable {
        new MonthlyConsolidatedReport(driver).selectFeeType(arg1);
    }

    @When("^select pay mode on monthly consolidated report$")
    public void select_pay_mode_on_monthly_consolidated_report() throws Throwable {
        new MonthlyConsolidatedReport(driver).selectPayMode();
    }

    @When("^select head on monthly consolidated report$")
    public void select_head_on_monthly_consolidated_report() throws Throwable {
        new MonthlyConsolidatedReport(driver).selectHead();
    }

    @When("^select installment on monthly consolidated report$")
    public void select_installment_on_monthly_consolidated_report() throws Throwable {
        new MonthlyConsolidatedReport(driver).selectInstallment();
    }

    @When("^select month on monthly consolidated report$")
    public void select_month_on_monthly_consolidated_report() throws Throwable {
        new MonthlyConsolidatedReport(driver).selectMonth();
    }

    @When("^select bank name on monthly consolidated report$")
    public void select_bank_name_on_monthly_consolidated_report() throws Throwable {
        new MonthlyConsolidatedReport(driver).selectBankName();
    }

    @When("^select cheque bank on monthly consolidated report$")
    public void select_cheque_bank_on_monthly_consolidated_report() throws Throwable {
        new MonthlyConsolidatedReport(driver).selectChequebank();
    }

    @When("^select user with index \"([^\"]*)\" on monthly consolidated report$")
    public void select_user_with_index_on_monthly_consolidated_report(int arg1) throws Throwable {
        new MonthlyConsolidatedReport(driver).selectUser(arg1);
    }

    @Then("^click show on monthly consolidated report$")
    public void click_show_on_monthly_consolidated_report() throws Throwable {
        new MonthlyConsolidatedReport(driver).clickShow();
    }

    @When("^click cheque clearing date on monthly consolidated report$")
    public void click_cheque_clearing_date_on_monthly_consolidated_report() throws Throwable {
        new MonthlyConsolidatedReport(driver).clickChequeClearanceDate();
    }

    @When("^select radio button \"([^\"]*)\" on monthly consolidated report$")
    public void select_radio_button_on_monthly_consolidated_report(String arg1) throws Throwable {
        new MonthlyConsolidatedReport(driver).clickButton(arg1);
    }

    @When("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on monthly consolidated report$")
    public void select_from_date_as_month_year_and_day_on_monthly_consolidated_report(String arg1, String arg2, String arg3) throws Throwable {
        new MonthlyConsolidatedReport(driver).selectFromDate(arg1, arg2, arg3);
    }

    @When("^select to date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on monthly consolidated report$")
    public void select_to_date_as_month_year_and_day_on_monthly_consolidated_report(String arg1, String arg2, String arg3) throws Throwable {
        new MonthlyConsolidatedReport(driver).selectToDate(arg1, arg2, arg3);
    }

    @Then("^verify alert message for date on monthly consolidated report$")
    public void verify_alert_message_for_date_on_monthly_consolidated_report() throws Throwable {
        new MonthlyConsolidatedReport(driver).validateDateAlertMessage();
    }

//month wise collection report
    @When("^user open month wise collection report$")
    public void user_open_month_wise_collection_report() throws Throwable {
        new MonthWiseCollectionReport(driver).openMonthWiseCollectionReport();
    }

    @When("^verify validation when no class is selected on month wise collection report$")
    public void verify_validation_when_no_class_is_selected_on_month_wise_collection_report() throws Throwable {
        new MonthWiseCollectionReport(driver).validateClass();
    }

    @When("^verify validation when no entry mode is selected on month wise collection report$")
    public void verify_validation_when_no_entry_mode_is_selected_on_month_wise_collection_report() throws Throwable {
        new MonthWiseCollectionReport(driver).validateEntryMode();
    }

    @When("^verify validation when no head is selected on month wise collection report$")
    public void verify_validation_when_no_head_is_selected_on_month_wise_collection_report() throws Throwable {
        new MonthWiseCollectionReport(driver).validateHead();
    }

    @When("^select installment \"([^\"]*)\" on month wise collection report$")
    public void select_installment_on_month_wise_collection_report(String arg1) throws Throwable {
        new MonthWiseCollectionReport(driver).selectInstallment(arg1);
    }

    @When("^verify validation when no installment is selected on month wise collection report$")
    public void verify_validation_when_no_installment_is_selected_on_month_wise_collection_report() throws Throwable {
        new MonthWiseCollectionReport(driver).validateInstallment();
    }

    @When("^verify validation when no month is selected on month wise collection report$")
    public void verify_validation_when_no_month_is_selected_on_month_wise_collection_report() throws Throwable {
        new MonthWiseCollectionReport(driver).validateMonth();
    }

    @When("^verify validation when no bank name is selected on month wise collection report$")
    public void verify_validation_when_no_bank_name_is_selected_on_month_wise_collection_report() throws Throwable {
        new MonthWiseCollectionReport(driver).validateBankName();
    }

    @When("^click show on month wise collection report$")
    public void click_show_on_month_wise_collection_report() throws Throwable {
        new MonthWiseCollectionReport(driver).clickShow();
    }

    @When("^select school with index \"([^\"]*)\" on month wise collection report$")
    public void select_school_with_index_on_month_wise_collection_report(int arg1) throws Throwable {
        new MonthWiseCollectionReport(driver).selectSchool(arg1);
    }

    @When("^select wing with index \"([^\"]*)\" on month wise collection report$")
    public void select_wing_with_index_on_month_wise_collection_report(int arg1) throws Throwable {
        new MonthWiseCollectionReport(driver).selectWing(arg1);
    }

    @When("^select class on month wise collection report$")
    public void select_class_on_month_wise_collection_report() throws Throwable {
        new MonthWiseCollectionReport(driver).selectClass();
    }

    @When("^select board with index \"([^\"]*)\" on month wise collection report$")
    public void select_board_with_index_on_month_wise_collection_report(int arg1) throws Throwable {
        new MonthWiseCollectionReport(driver).selectBoard(arg1);
    }

    @When("^select entry mode on month wise collection report$")
    public void select_entry_mode_on_month_wise_collection_report() throws Throwable {
        new MonthWiseCollectionReport(driver).selectEntryMode();
    }

    @When("^select fee type with index \"([^\"]*)\" on month wise collection report$")
    public void select_fee_type_with_index_on_month_wise_collection_report(int arg1) throws Throwable {
        new MonthWiseCollectionReport(driver).selectFeeType(arg1);
    }

    @When("^select head on month wise collection report$")
    public void select_head_on_month_wise_collection_report() throws Throwable {
        new MonthWiseCollectionReport(driver).selectHead();
    }

    @When("^select installment with index \"([^\"]*)\" on month wise collection report$")
    public void select_installment_with_index_on_month_wise_collection_report(int arg1) throws Throwable {
        new MonthWiseCollectionReport(driver).selectInstallment(arg1);
    }

    @When("^select month on month wise collection report$")
    public void select_month_on_month_wise_collection_report() throws Throwable {
        new MonthWiseCollectionReport(driver).selectMonth();
    }

    @When("^select bank name on month wise collection report$")
    public void select_bank_name_on_month_wise_collection_report() throws Throwable {
        new MonthWiseCollectionReport(driver).selectBankName();
    }

    @When("^select user with index \"([^\"]*)\" on month wise collection report$")
    public void select_user_with_index_on_month_wise_collection_report(int arg1) throws Throwable {
        new MonthWiseCollectionReport(driver).selectUser(arg1);
    }

//receipt wise fee type collection
    @When("^user open receipt wise fee type collection$")
    public void user_open_receipt_wise_fee_type_collection() throws Throwable {
        new ReceiptWiseFeeTypeCollection(driver).openReceiptWiseFeeTypeCollection();
    }

    @When("^verify validation when no class is selected on receipt wise fee type collection$")
    public void verify_validation_when_no_class_is_selected_on_receipt_wise_fee_type_collection() throws Throwable {
        new ReceiptWiseFeeTypeCollection(driver).validateClass();
    }

    @When("^verify validation when no pay mode is selected on receipt wise fee type collection$")
    public void verify_validation_when_no_pay_mode_is_selected_on_receipt_wise_fee_type_collection() throws Throwable {
        new ReceiptWiseFeeTypeCollection(driver).validatePayMode();
    }

    @Then("^verify validation when no bank name is selected on receipt wise fee type collection$")
    public void verify_validation_when_no_bank_name_is_selected_on_receipt_wise_fee_type_collection() throws Throwable {
        new ReceiptWiseFeeTypeCollection(driver).validateBankName();
    }

    @When("^select school with index \"([^\"]*)\" on receipt wise fee type collection$")
    public void select_school_with_index_on_receipt_wise_fee_type_collection(int arg1) throws Throwable {
        new ReceiptWiseFeeTypeCollection(driver).selectSchool(arg1);
    }

    @When("^select wing with index \"([^\"]*)\" on receipt wise fee type collection$")
    public void select_wing_with_index_on_receipt_wise_fee_type_collection(int arg1) throws Throwable {
        new ReceiptWiseFeeTypeCollection(driver).selectWing(arg1);
    }

    @When("^select class on receipt wise fee type collection$")
    public void select_class_on_receipt_wise_fee_type_collection() throws Throwable {
        new ReceiptWiseFeeTypeCollection(driver).selectClass();
    }

    @When("^select board with index \"([^\"]*)\" on receipt wise fee type collection$")
    public void select_board_with_index_on_receipt_wise_fee_type_collection(int arg1) throws Throwable {
        new ReceiptWiseFeeTypeCollection(driver).selectBoard(arg1);
    }

    @When("^select fee type with index \"([^\"]*)\" on receipt wise fee type collection$")
    public void select_fee_type_with_index_on_receipt_wise_fee_type_collection(int arg1) throws Throwable {
        new ReceiptWiseFeeTypeCollection(driver).selectFeeType(arg1);
    }

    @When("^select installment with index \"([^\"]*)\" on receipt wise fee type collection$")
    public void select_installment_with_index_on_receipt_wise_fee_type_collection(int arg1) throws Throwable {
        new ReceiptWiseFeeTypeCollection(driver).selectInstallment(arg1);
    }

    @When("^select pay mode on receipt wise fee type collection$")
    public void select_pay_mode_on_receipt_wise_fee_type_collection() throws Throwable {
        new ReceiptWiseFeeTypeCollection(driver).selectPayMode();
    }

    @When("^select user with index \"([^\"]*)\" on receipt wise fee type collection$")
    public void select_user_with_index_on_receipt_wise_fee_type_collection(int arg1) throws Throwable {
        new ReceiptWiseFeeTypeCollection(driver).selectUser(arg1);
    }

    @When("^select bank name on receipt wise fee type collection$")
    public void select_bank_name_on_receipt_wise_fee_type_collection() throws Throwable {
        new ReceiptWiseFeeTypeCollection(driver).selectBankName();
    }

    @When("^select newold student with index \"([^\"]*)\" on receipt wise fee type collection$")
    public void select_newold_student_with_index_on_receipt_wise_fee_type_collection(int arg1) throws Throwable {
        new ReceiptWiseFeeTypeCollection(driver).selectNewOldStudent(arg1);
    }

    @When("^select student status with index \"([^\"]*)\" on receipt wise fee type collection$")
    public void select_student_status_with_index_on_receipt_wise_fee_type_collection(int arg1) throws Throwable {
        new ReceiptWiseFeeTypeCollection(driver).selectStudentStatus(arg1);
    }

    @Then("^click show on receipt wise fee type collection$")
    public void click_show_on_receipt_wise_fee_type_collection() throws Throwable {
        new ReceiptWiseFeeTypeCollection(driver).clickShow();
    }

    @When("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on receipt wise fee type collection$")
    public void select_from_date_as_month_year_and_day_on_receipt_wise_fee_type_collection(String arg1, String arg2, String arg3) throws Throwable {
        new ReceiptWiseFeeTypeCollection(driver).selectFromDate(arg1, arg2, arg3);
    }

    @When("^select settlement date on receipt wise fee type collection$")
    public void select_settlement_date_on_receipt_wise_fee_type_collection() throws Throwable {
        new ReceiptWiseFeeTypeCollection(driver).clickSettlementDate();
    }

    @When("^select radio button \"([^\"]*)\" on receipt wise fee type collection$")
    public void select_radio_button_on_receipt_wise_fee_type_collection(String arg1) throws Throwable {
        new ReceiptWiseFeeTypeCollection(driver).clickButton(arg1);
    }

    @When("^select student wise on receipt wise fee type collection$")
    public void select_student_wise_on_receipt_wise_fee_type_collection() throws Throwable {
        new ReceiptWiseFeeTypeCollection(driver).selectStudentWise();
    }

    @When("^select cheque clearance date on receipt wise fee type collection$")
    public void select_cheque_clearance_date_on_receipt_wise_fee_type_collection() throws Throwable {
        new ReceiptWiseFeeTypeCollection(driver).clickChequeClearanceDate();
    }

    @When("^select head wise on receipt wise fee type collection$")
    public void select_head_wise_on_receipt_wise_fee_type_collection() throws Throwable {
        new ReceiptWiseFeeTypeCollection(driver).selectHeadWise();
    }

    @When("^select show remark on receipt wise fee type collection$")
    public void select_show_remark_on_receipt_wise_fee_type_collection() throws Throwable {
        new ReceiptWiseFeeTypeCollection(driver).clickShowRemark();
    }

    @When("^select date wise on receipt wise fee type collection$")
    public void select_date_wise_on_receipt_wise_fee_type_collection() throws Throwable {
        new ReceiptWiseFeeTypeCollection(driver).selectDateWise();
    }

//receipt wise daily collection
    @When("^user open receipt wise daily collection$")
    public void user_open_receipt_wise_daily_collection() throws Throwable {
        new ReceiptWiseDailyCollection(driver).openReceiptWiseDailyCollection();
    }

    @When("^verify validation when no class is selected on receipt wise daily collection$")
    public void verify_validation_when_no_class_is_selected_on_receipt_wise_daily_collection() throws Throwable {
        new ReceiptWiseDailyCollection(driver).validateClass();
    }

    @When("^verify validation when no pay mode is selected on receipt wise daily collection$")
    public void verify_validation_when_no_pay_mode_is_selected_on_receipt_wise_daily_collection() throws Throwable {
        new ReceiptWiseDailyCollection(driver).validatePayMode();
    }

    @When("^verify validation when no date from is selected on receipt wise daily collection$")
    public void verify_validation_when_no_date_from_is_selected_on_receipt_wise_daily_collection() throws Throwable {
        new ReceiptWiseDailyCollection(driver).validateDateFrom();
    }

    @When("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on receipt wise daily collection$")
    public void select_from_date_as_month_year_and_day_on_receipt_wise_daily_collection(String arg1, String arg2, String arg3) throws Throwable {
        new ReceiptWiseDailyCollection(driver).selectFromDate(arg1, arg2, arg3);
    }

    @When("^verify validation when no date to is selected on receipt wise daily collection$")
    public void verify_validation_when_no_date_to_is_selected_on_receipt_wise_daily_collection() throws Throwable {
        new ReceiptWiseDailyCollection(driver).validateToDate();
    }

    @Then("^verify validation when no bank name is selected on receipt wise daily collection$")
    public void verify_validation_when_no_bank_name_is_selected_on_receipt_wise_daily_collection() throws Throwable {
        new ReceiptWiseDailyCollection(driver).validateBankName();
    }

    @When("^select to date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on receipt wise daily collection$")
    public void select_to_date_as_month_year_and_day_on_receipt_wise_daily_collection(String arg1, String arg2, String arg3) throws Throwable {
        new ReceiptWiseDailyCollection(driver).selectToDate(arg1, arg2, arg3);
    }

    @When("^click show on receipt wise daily collection$")
    public void click_show_on_receipt_wise_daily_collection() throws Throwable {
        new ReceiptWiseDailyCollection(driver).clickShow();
    }

    @Then("^verify alert message for date on receipt wise daily collection$")
    public void verify_alert_message_for_date_on_receipt_wise_daily_collection() throws Throwable {
        new ReceiptWiseDailyCollection(driver).validateDateAlertMessage();
    }

    @When("^select school with index \"([^\"]*)\" on receipt wise daily collection$")
    public void select_school_with_index_on_receipt_wise_daily_collection(int arg1) throws Throwable {
        new ReceiptWiseDailyCollection(driver).selectSchool(arg1);
    }

    @When("^select wing with index \"([^\"]*)\" on receipt wise daily collection$")
    public void select_wing_with_index_on_receipt_wise_daily_collection(int arg1) throws Throwable {
        new ReceiptWiseDailyCollection(driver).selectWing(arg1);
    }

    @When("^select class on receipt wise daily collection$")
    public void select_class_on_receipt_wise_daily_collection() throws Throwable {
        new ReceiptWiseDailyCollection(driver).selectClass();
    }

    @When("^select board with index \"([^\"]*)\" on receipt wise daily collection$")
    public void select_board_with_index_on_receipt_wise_daily_collection(int arg1) throws Throwable {
        new ReceiptWiseDailyCollection(driver).selectBoard(arg1);
    }

    @When("^select fee type with index \"([^\"]*)\" on receipt wise daily collection$")
    public void select_fee_type_with_index_on_receipt_wise_daily_collection(int arg1) throws Throwable {
        new ReceiptWiseDailyCollection(driver).selectFeeType(arg1);
    }

    @When("^select pay mode on receipt wise daily collection$")
    public void select_pay_mode_on_receipt_wise_daily_collection() throws Throwable {
        new ReceiptWiseDailyCollection(driver).selectPayMode();
    }

    @When("^select bank name on receipt wise daily collection$")
    public void select_bank_name_on_receipt_wise_daily_collection() throws Throwable {
        new ReceiptWiseDailyCollection(driver).selectBankName();
    }

    @When("^select order by with index \"([^\"]*)\" on receipt wise daily collection$")
    public void select_order_by_with_index_on_receipt_wise_daily_collection(int arg1) throws Throwable {
        new ReceiptWiseDailyCollection(driver).selectOrderBy(arg1);
    }

    @When("^select user with index \"([^\"]*)\" on receipt wise daily collection$")
    public void select_user_with_index_on_receipt_wise_daily_collection(int arg1) throws Throwable {
        new ReceiptWiseDailyCollection(driver).selectUser(arg1);
    }

    @When("^click amalgamated report on receipt wise daily collection$")
    public void click_amalgamated_report_on_receipt_wise_daily_collection() throws Throwable {
        new ReceiptWiseDailyCollection(driver).clickAmalgamatedReport();
    }

    @When("^select radio button \"([^\"]*)\" on receipt wise daily collection$")
    public void select_radio_button_on_receipt_wise_daily_collection(String arg1) throws Throwable {
        new ReceiptWiseDailyCollection(driver).clickButton(arg1);
    }

//fee collection with entry time concession
    @When("^user open fee collection with entry time concession$")
    public void user_open_fee_collection_with_entry_time_concession() throws Throwable {
        new FeeCollectionWithEntryTimeConcession(driver).openFeeCollectionWithEntryTimeConcession();
    }

    @When("^verify validation when no entry mode is selected on fee collection with entry time concession$")
    public void verify_validation_when_no_entry_mode_is_selected_on_fee_collection_with_entry_time_concession() throws Throwable {
        new FeeCollectionWithEntryTimeConcession(driver).validateEntryMode();
    }

    @When("^verify validation when no pay mode is selected on fee collection with entry time concession$")
    public void verify_validation_when_no_pay_mode_is_selected_on_fee_collection_with_entry_time_concession() throws Throwable {
        new FeeCollectionWithEntryTimeConcession(driver).validatePayMode();
    }

    @When("^verify validation when no collection date is selected on fee collection with entry time concession$")
    public void verify_validation_when_no_collection_date_is_selected_on_fee_collection_with_entry_time_concession() throws Throwable {
        new FeeCollectionWithEntryTimeConcession(driver).validateCollectionDate();
    }

    @When("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on fee collection with entry time concession$")
    public void select_from_date_as_month_year_and_day_on_fee_collection_with_entry_time_concession(String arg1, String arg2, String arg3) throws Throwable {
        new FeeCollectionWithEntryTimeConcession(driver).selectFromDate(arg1, arg2, arg3);
    }

    @When("^click receipt no range on fee collection with entry time concession$")
    public void click_receipt_no_range_on_fee_collection_with_entry_time_concession() throws Throwable {
        new FeeCollectionWithEntryTimeConcession(driver).clickReceiptRange();
    }

    @When("^enter value \"([^\"]*)\" in receipt from on fee collection with entry time concession$")
    public void enter_value_in_receipt_from_on_fee_collection_with_entry_time_concession(String arg1) throws Throwable {
        new FeeCollectionWithEntryTimeConcession(driver).enterReceiptFrom(arg1);
        new FeeCollectionWithEntryTimeConcession(driver).pressEnterInReceiptFrom();
    }

    @Then("^verify numeric validation for receipt from on fee collection with entry time concession$")
    public void verify_numeric_validation_for_receipt_from_on_fee_collection_with_entry_time_concession() throws Throwable {
        new FeeCollectionWithEntryTimeConcession(driver).validateReceiptFromMessage();
    }

    @Then("^enter \"([^\"]*)\" digits in receipt from on fee collection with entry time concession$")
    public void enter_digits_in_receipt_from_on_fee_collection_with_entry_time_concession(int arg1) throws Throwable {
        new FeeCollectionWithEntryTimeConcession(driver).enterReceiptFrom(arg1);
        new FeeCollectionWithEntryTimeConcession(driver).pressEnterInReceiptFrom();
    }

    @Then("^verify length validation on receipt from on fee collection with entry time concession$")
    public void verify_length_validation_on_receipt_from_on_fee_collection_with_entry_time_concession() throws Throwable {
        new FeeCollectionWithEntryTimeConcession(driver).validateReceiptFromLength();
    }

    @Then("^enter value \"([^\"]*)\" in receipt to on fee collection with entry time concession$")
    public void enter_value_in_receipt_to_on_fee_collection_with_entry_time_concession(String arg1) throws Throwable {
        new FeeCollectionWithEntryTimeConcession(driver).enterReceiptTo(arg1);
        new FeeCollectionWithEntryTimeConcession(driver).pressEnterReceiptTo();
    }

    @Then("^verify numeric validation for receipt to on fee collection with entry time concession$")
    public void verify_numeric_validation_for_receipt_to_on_fee_collection_with_entry_time_concession() throws Throwable {
        new FeeCollectionWithEntryTimeConcession(driver).validateReceiptToMessage();
    }

    @Then("^enter \"([^\"]*)\" digits in receipt to on fee collection with entry time concession$")
    public void enter_digits_in_receipt_to_on_fee_collection_with_entry_time_concession(int arg1) throws Throwable {
        new FeeCollectionWithEntryTimeConcession(driver).enterReceiptTo(arg1);
        new FeeCollectionWithEntryTimeConcession(driver).pressEnterReceiptTo();
    }

    @Then("^verify length validation on receipt to on fee collection with entry time concession$")
    public void verify_length_validation_on_receipt_to_on_fee_collection_with_entry_time_concession() throws Throwable {
        new FeeCollectionWithEntryTimeConcession(driver).validateReceiptToLength();
    }

    @Then("^verify validation when no head is selected on fee collection with entry time concession$")
    public void verify_validation_when_no_head_is_selected_on_fee_collection_with_entry_time_concession() throws Throwable {
        new FeeCollectionWithEntryTimeConcession(driver).validateHead();
    }

    @Then("^verify alert message for blank receipt from on fee collection with entry time concession$")
    public void verify_alert_message_for_blank_receipt_from_on_fee_collection_with_entry_time_concession() throws Throwable {
        new FeeCollectionWithEntryTimeConcession(driver).validateBlankReceiptFromAlertMessage();
    }

    @Then("^verify alert message for blank receipt to on fee collection with entry time concession$")
    public void verify_alert_message_for_blank_receipt_to_on_fee_collection_with_entry_time_concession() throws Throwable {
        new FeeCollectionWithEntryTimeConcession(driver).validateBlankReceiptToAlertMessage();
    }

    @When("^click show on fee collection with entry time concession$")
    public void click_show_on_fee_collection_with_entry_time_concession() throws Throwable {
        new FeeCollectionWithEntryTimeConcession(driver).clickShow();
    }

    @Then("^verify alert message for invalid receipt range on fee collection with entry time concession$")
    public void verify_alert_message_for_invalid_receipt_range_on_fee_collection_with_entry_time_concession() throws Throwable {
        new FeeCollectionWithEntryTimeConcession(driver).validateInvalidReceiptRangeAlertMessage();
    }

    @When("^select school with index \"([^\"]*)\" on fee collection with entry time concession$")
    public void select_school_with_index_on_fee_collection_with_entry_time_concession(int arg1) throws Throwable {
        new FeeCollectionWithEntryTimeConcession(driver).selectSchool(arg1);
    }

    @When("^select entry mode on fee collection with entry time concession$")
    public void select_entry_mode_on_fee_collection_with_entry_time_concession() throws Throwable {
        new FeeCollectionWithEntryTimeConcession(driver).selectEntryMode();
    }

    @When("^select pay mode on fee collection with entry time concession$")
    public void select_pay_mode_on_fee_collection_with_entry_time_concession() throws Throwable {
        new FeeCollectionWithEntryTimeConcession(driver).selectPayMode();
    }

    @When("^select fee type with index \"([^\"]*)\" on fee collection with entry time concession$")
    public void select_fee_type_with_index_on_fee_collection_with_entry_time_concession(int arg1) throws Throwable {
        new FeeCollectionWithEntryTimeConcession(driver).selectFeeType(arg1);
    }

    @When("^select head on fee collection with entry time concession$")
    public void select_head_on_fee_collection_with_entry_time_concession() throws Throwable {
        new FeeCollectionWithEntryTimeConcession(driver).selectHead();
    }

    @When("^select radio button \"([^\"]*)\" on fee collection with entry time concession$")
    public void select_radio_button_on_fee_collection_with_entry_time_concession(String arg1) throws Throwable {
        new FeeCollectionWithEntryTimeConcession(driver).clickButton(arg1);
    }

//reconcile report
    @When("^user open reconcile report$")
    public void user_open_reconcile_report() throws Throwable {
        new ReconcileReport(driver).openReconcileReport();
    }

    @When("^verify validation when no class is selected on reconcile report$")
    public void verify_validation_when_no_class_is_selected_on_reconcile_report() throws Throwable {
        new ReconcileReport(driver).validateClass();
    }

    @Then("^verify validation when no installment is selected on reconcile report$")
    public void verify_validation_when_no_installment_is_selected_on_reconcile_report() throws Throwable {
        new ReconcileReport(driver).validateInstallment();
    }

    @When("^select school with index \"([^\"]*)\" on reconcile report$")
    public void select_school_with_index_on_reconcile_report(int arg1) throws Throwable {
        new ReconcileReport(driver).selectSchool(arg1);
    }

    @When("^select wing with index \"([^\"]*)\" on reconcile report$")
    public void select_wing_with_index_on_reconcile_report(int arg1) throws Throwable {
        new ReconcileReport(driver).selectWing(arg1);
    }

    @When("^select class on reconcile report$")
    public void select_class_on_reconcile_report() throws Throwable {
        new ReconcileReport(driver).selectClass();
    }

    @When("^select board with index \"([^\"]*)\" on reconcile report$")
    public void select_board_with_index_on_reconcile_report(int arg1) throws Throwable {
        new ReconcileReport(driver).selectBoard(arg1);
    }

    @When("^select fee type with index \"([^\"]*)\" on reconcile report$")
    public void select_fee_type_with_index_on_reconcile_report(int arg1) throws Throwable {
        new ReconcileReport(driver).selectFeeType(arg1);
    }

    @When("^select installment on reconcile report$")
    public void select_installment_on_reconcile_report() throws Throwable {
        new ReconcileReport(driver).selectInstallment();
    }

    @When("^select user with index \"([^\"]*)\" on reconcile report$")
    public void select_user_with_index_on_reconcile_report(int arg1) throws Throwable {
        new ReconcileReport(driver).selectUser(arg1);
    }

    @When("^click show on reconcile report$")
    public void click_show_on_reconcile_report() throws Throwable {
        new ReconcileReport(driver).clickShow();
    }

    @When("^select radio button \"([^\"]*)\" on reconcile report$")
    public void select_radio_button_on_reconcile_report(String arg1) throws Throwable {
        new ReconcileReport(driver).clickButton(arg1);
    }

    @When("^click format on reconcile report$")
    public void click_format_on_reconcile_report() throws Throwable {
        new ReconcileReport(driver).clickFormat1();
    }

//reconcile installment class wise
    @When("^user open reconcile installment class wise$")
    public void user_open_reconcile_installment_class_wise() throws Throwable {
        new ReconcileInstallmentClassWise(driver).openReconcileInstallmentClassWise();
    }

    @When("^verify validation when no class is selected on reconcile installment class wise$")
    public void verify_validation_when_no_class_is_selected_on_reconcile_installment_class_wise() throws Throwable {
        new ReconcileInstallmentClassWise(driver).validateClass();
    }

    @Then("^verify validation when no installment is selected on reconcile installment class wise$")
    public void verify_validation_when_no_installment_is_selected_on_reconcile_installment_class_wise() throws Throwable {
        new ReconcileInstallmentClassWise(driver).validateInstallment();
    }

    @When("^select fee type with index \"([^\"]*)\" on reconcile installment class wise$")
    public void select_fee_type_with_index_on_reconcile_installment_class_wise(int arg1) throws Throwable {
        new ReconcileInstallmentClassWise(driver).selectFeeType(arg1);
    }

    @When("^select class on reconcile installment class wise$")
    public void select_class_on_reconcile_installment_class_wise() throws Throwable {
        new ReconcileInstallmentClassWise(driver).selectClass();
    }

    @When("^select installment on reconcile installment class wise$")
    public void select_installment_on_reconcile_installment_class_wise() throws Throwable {
        new ReconcileInstallmentClassWise(driver).selectInstallment();
    }

    @Then("^click show on reconcile installment class wise$")
    public void click_show_on_reconcile_installment_class_wise() throws Throwable {
        new ReconcileInstallmentClassWise(driver).clickShow();
    }

//fees concession
    @When("^user open fees concession$")
    public void user_open_fees_concession() throws Throwable {
        new FeesConcession(driver).openFeesConcession();
    }

    @When("^verify validation when no class is selected on fees concession$")
    public void verify_validation_when_no_class_is_selected_on_fees_concession() throws Throwable {
        new FeesConcession(driver).validateClass();
    }

    @When("^verify validation when no head is selected on fees concession$")
    public void verify_validation_when_no_head_is_selected_on_fees_concession() throws Throwable {
        new FeesConcession(driver).validateHead();
    }

    @When("^verify validation when no installment is selected on fees concession$")
    public void verify_validation_when_no_installment_is_selected_on_fees_concession() throws Throwable {
        new FeesConcession(driver).validateInstallment();
    }

    @When("^verify validation when no concession is selected on fees concession$")
    public void verify_validation_when_no_concession_is_selected_on_fees_concession() throws Throwable {
        new FeesConcession(driver).validateConcession();
    }

    @Then("^verify validation when till date is not selected on fees concession$")
    public void verify_validation_when_till_date_is_not_selected_on_fees_concession() throws Throwable {
        new FeesConcession(driver).validateTillDate();
    }

//annual stu led report
    @When("^user open annual stu led report$")
    public void user_open_annual_stu_led_report() throws Throwable {
        new AnnualStuLedReport(driver).openAnnualStuLedReport();
    }

    @Then("^verify validation when no installment is selected on annual stu led report$")
    public void verify_validation_when_no_installment_is_selected_on_annual_stu_led_report() throws Throwable {
        new AnnualStuLedReport(driver).validateInstallment();
    }

    @When("^select installment on annual stu led report$")
    public void select_installment_on_annual_stu_led_report() throws Throwable {
        new AnnualStuLedReport(driver).selectInstallment();
    }

    @When("^select class with index \"([^\"]*)\" on annual stu led report$")
    public void select_class_with_index_on_annual_stu_led_report(int arg1) throws Throwable {
        new AnnualStuLedReport(driver).selectClass(arg1);
    }

    @When("^select section with index \"([^\"]*)\" on annual stu led report$")
    public void select_section_with_index_on_annual_stu_led_report(int arg1) throws Throwable {
        new AnnualStuLedReport(driver).selectSection(arg1);
    }

    @Then("^click show on annual stu led report$")
    public void click_show_on_annual_stu_led_report() throws Throwable {
        new AnnualStuLedReport(driver).clickShow();
    }

//daily fee collection date class wise
    @When("^user open daily fee collection date class wise$")
    public void user_open_daily_fee_collection_date_class_wise() throws Throwable {
        new DailyFeeCollectionDateClassWise(driver).openDailyFeeCollectionDateClassWise();
    }

    @Then("^verify validation when no head is selected on daily fee collection date class wise$")
    public void verify_validation_when_no_head_is_selected_on_daily_fee_collection_date_class_wise() throws Throwable {
        new DailyFeeCollectionDateClassWise(driver).validateHead();
    }

//bad debts report
    @When("^user open bad debts report$")
    public void user_open_bad_debts_report() throws Throwable {
        new BadDebtsReport(driver).openBadDebtsReport();
    }

    @Then("^verify validation when no class is selected on bad debts report$")
    public void verify_validation_when_no_class_is_selected_on_bad_debts_report() throws Throwable {
        new BadDebtsReport(driver).validateClass();
    }

    @Then("^verify validation when no installment is selected on bad debts report$")
    public void verify_validation_when_no_installment_is_selected_on_bad_debts_report() throws Throwable {
        new BadDebtsReport(driver).validateInstallment();
    }

    @When("^select fee type with index \"([^\"]*)\" on bad debts report$")
    public void select_fee_type_with_index_on_bad_debts_report(int arg1) throws Throwable {
        new BadDebtsReport(driver).selectFeeType(arg1);
    }

    @When("^select class on bad debts report$")
    public void select_class_on_bad_debts_report() throws Throwable {
        new BadDebtsReport(driver).selectClass();
    }

    @Then("^select installment on bad debts report$")
    public void select_installment_on_bad_debts_report() throws Throwable {
        new BadDebtsReport(driver).selectInstallment();
    }

    @Then("^click show on bad debts report$")
    public void click_show_on_bad_debts_report() throws Throwable {
        new BadDebtsReport(driver).clickShow();
    }

//online payment status report
    @When("^user open online payment status report$")
    public void user_open_online_payment_status_report() throws Throwable {
        new OnlinePaymentStatusReport(driver).openOnlinePaymentStatusReport();
    }

    @When("^verify validation when no from date is selected on online payment status report$")
    public void verify_validation_when_no_from_date_is_selected_on_online_payment_status_report() throws Throwable {
        new OnlinePaymentStatusReport(driver).validateDateFrom();
    }

    @When("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on online payment status report$")
    public void select_from_date_as_month_year_and_day_on_online_payment_status_report(String arg1, String arg2, String arg3) throws Throwable {
        new OnlinePaymentStatusReport(driver).selectFromDate(arg1, arg2, arg3);
    }

    @When("^verify validation when no till date is selected on online payment status report$")
    public void verify_validation_when_no_till_date_is_selected_on_online_payment_status_report() throws Throwable {
        new OnlinePaymentStatusReport(driver).validateTillDate();
    }

    @When("^select to date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on online payment status report$")
    public void select_to_date_as_month_year_and_day_on_online_payment_status_report(String arg1, String arg2, String arg3) throws Throwable {
        new OnlinePaymentStatusReport(driver).selectToDate(arg1, arg2, arg3);
    }

    @When("^click show on online payment status report$")
    public void click_show_on_online_payment_status_report() throws Throwable {
        new OnlinePaymentStatusReport(driver).clickShow();
    }

    @Then("^verify alert message for date on online payment status report$")
    public void verify_alert_message_for_date_on_online_payment_status_report() throws Throwable {
        new OnlinePaymentStatusReport(driver).validateDateAlertMessage();
    }

//cheque report date wise
    @When("^user open cheque report date wise$")
    public void user_open_cheque_report_date_wise() throws Throwable {
        new ChequeReportDateWise(driver).openChequeReportDateWise();
    }

    @When("^verify validation when no entry mode is selected on cheque report date wise$")
    public void verify_validation_when_no_entry_mode_is_selected_on_cheque_report_date_wise() throws Throwable {
        new ChequeReportDateWise(driver).validateEntryMode();
    }

    @When("^verify validation when no date from is selected on cheque report date wise$")
    public void verify_validation_when_no_date_from_is_selected_on_cheque_report_date_wise() throws Throwable {
        new ChequeReportDateWise(driver).validateDateFrom();
    }

    @When("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on cheque report date wise$")
    public void select_from_date_as_month_year_and_day_on_cheque_report_date_wise(String arg1, String arg2, String arg3) throws Throwable {
        new ChequeReportDateWise(driver).selectFromDate(arg1, arg2, arg3);
    }

    @When("^verify validation when no date to is selected on cheque report date wise$")
    public void verify_validation_when_no_date_to_is_selected_on_cheque_report_date_wise() throws Throwable {
        new ChequeReportDateWise(driver).validateToDate();
    }

    @When("^select to date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on cheque report date wise$")
    public void select_to_date_as_month_year_and_day_on_cheque_report_date_wise(String arg1, String arg2, String arg3) throws Throwable {
        new ChequeReportDateWise(driver).selectToDate(arg1, arg2, arg3);
    }

    @When("^verify validation when no class is selected on cheque report date wise$")
    public void verify_validation_when_no_class_is_selected_on_cheque_report_date_wise() throws Throwable {
        new ChequeReportDateWise(driver).validateClass();
    }

    @When("^verify validation when no cheque bank is selected on cheque report date wise$")
    public void verify_validation_when_no_cheque_bank_is_selected_on_cheque_report_date_wise() throws Throwable {
        new ChequeReportDateWise(driver).validateChequeBank();
    }

    @When("^click show on cheque report date wise$")
    public void click_show_on_cheque_report_date_wise() throws Throwable {
        new ChequeReportDateWise(driver).clickShow();
    }

    @Then("^verify alert message for date on cheque report date wise$")
    public void verify_alert_message_for_date_on_cheque_report_date_wise() throws Throwable {
        new ChequeReportDateWise(driver).validateDateAlertMessage();
    }

    @When("^select entry mode on cheque report date wise$")
    public void select_entry_mode_on_cheque_report_date_wise() throws Throwable {
        new ChequeReportDateWise(driver).selectEntryMode();
    }

    @When("^select class on cheque report date wise$")
    public void select_class_on_cheque_report_date_wise() throws Throwable {
        new ChequeReportDateWise(driver).selectClass();
    }

    @When("^select school with index \"([^\"]*)\" on cheque report date wise$")
    public void select_school_with_index_on_cheque_report_date_wise(int arg1) throws Throwable {
        new ChequeReportDateWise(driver).selectSchool(arg1);
    }

    @When("^select fee type with index \"([^\"]*)\" on cheque report date wise$")
    public void select_fee_type_with_index_on_cheque_report_date_wise(int arg1) throws Throwable {
        new ChequeReportDateWise(driver).selectFeeType(arg1);
    }

    @When("^select cheque bank on cheque report date wise$")
    public void select_cheque_bank_on_cheque_report_date_wise() throws Throwable {
        new ChequeReportDateWise(driver).selectChequeBank();
    }

    @When("^select user with index \"([^\"]*)\" on cheque report date wise$")
    public void select_user_with_index_on_cheque_report_date_wise(int arg1) throws Throwable {
        new ChequeReportDateWise(driver).selectUser(arg1);
    }

//fees cheque bounce report
    @Then("^user open fees cheque bounce report$")
    public void user_open_fees_cheque_bounce_report() throws Throwable {
        new FeesChequeBounceReport(driver).openFeesChequeBounceReport();
    }

    @Then("^verify validation when no date from is selected on fees cheque bounce report$")
    public void verify_validation_when_no_date_from_is_selected_on_fees_cheque_bounce_report() throws Throwable {
        new FeesChequeBounceReport(driver).validateDateFrom();
    }

    @Then("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on fees cheque bounce report$")
    public void select_from_date_as_month_year_and_day_on_fees_cheque_bounce_report(String arg1, String arg2, String arg3) throws Throwable {
        new FeesChequeBounceReport(driver).selectFromDate(arg1, arg2, arg3);
    }

    @Then("^verify validation when no date to is selected on fees cheque bounce report$")
    public void verify_validation_when_no_date_to_is_selected_on_fees_cheque_bounce_report() throws Throwable {
        new FeesChequeBounceReport(driver).validateToDate();
    }

    @When("^select to date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on fees cheque bounce report$")
    public void select_to_date_as_month_year_and_day_on_fees_cheque_bounce_report(String arg1, String arg2, String arg3) throws Throwable {
        new FeesChequeBounceReport(driver).selectToDate(arg1, arg2, arg3);
    }

    @Then("^verify alert message for date on fees cheque bounce report$")
    public void verify_alert_message_for_date_on_fees_cheque_bounce_report() throws Throwable {
        new FeesChequeBounceReport(driver).validateDateAlertMessage();
    }

    @Then("^select school with index \"([^\"]*)\" on fees cheque bounce report$")
    public void select_school_with_index_on_fees_cheque_bounce_report(int arg1) throws Throwable {
        new FeesChequeBounceReport(driver).selectSchool(arg1);
    }

    @Then("^select class with index \"([^\"]*)\" on fees cheque bounce report$")
    public void select_class_with_index_on_fees_cheque_bounce_report(int arg1) throws Throwable {
        new FeesChequeBounceReport(driver).selectClass(arg1);
    }

    @Then("^select section with index \"([^\"]*)\" on fees cheque bounce report$")
    public void select_section_with_index_on_fees_cheque_bounce_report(int arg1) throws Throwable {
        new FeesChequeBounceReport(driver).selectSection(arg1);
    }

    @Then("^select bank name with index \"([^\"]*)\" on fees cheque bounce report$")
    public void select_bank_name_with_index_on_fees_cheque_bounce_report(int arg1) throws Throwable {
        new FeesChequeBounceReport(driver).selectBankName(arg1);
    }

    @Then("^select user with index \"([^\"]*)\" on fees cheque bounce report$")
    public void select_user_with_index_on_fees_cheque_bounce_report(int arg1) throws Throwable {
        new FeesChequeBounceReport(driver).selectUser(arg1);
    }

    @Then("^select report filter with index \"([^\"]*)\" on fees cheque bounce report$")
    public void select_report_filter_with_index_on_fees_cheque_bounce_report(int arg1) throws Throwable {
        new FeesChequeBounceReport(driver).selectReportFilter(arg1);
    }

    @Then("^click show on fees cheque bounce report$")
    public void click_show_on_fees_cheque_bounce_report() throws Throwable {
        new FeesChequeBounceReport(driver).clickShow();
    }

    @Then("^click head wise on fees cheque bounce report$")
    public void click_head_wise_on_fees_cheque_bounce_report() throws Throwable {
        new FeesChequeBounceReport(driver).clickHeadWise();
    }

//annual student ledger 3
    @Then("^user open annual student ledger three$")
    public void user_open_annual_student_ledger_three() throws Throwable {
        new AnnualStudentLedger3(driver).openAnnualStudentLedger3();
    }

    @Then("^verify validation when no installment is selected on annual student ledger three$")
    public void verify_validation_when_no_installment_is_selected_on_annual_student_ledger_three() throws Throwable {
        new AnnualStudentLedger3(driver).validateInstallment();
    }

    @Then("^select installment on annual student ledger three$")
    public void select_installment_on_annual_student_ledger_three() throws Throwable {
        new AnnualStudentLedger3(driver).selectInstallment();
    }

    @Then("^select class with index \"([^\"]*)\" on annual student ledger three$")
    public void select_class_with_index_on_annual_student_ledger_three(int arg1) throws Throwable {
        new AnnualStudentLedger3(driver).selectClass(arg1);
    }

    @Then("^select section with index \"([^\"]*)\" on annual student ledger three$")
    public void select_section_with_index_on_annual_student_ledger_three(int arg1) throws Throwable {
        new AnnualStudentLedger3(driver).selectSection(arg1);
    }

    @Then("^click show on annual student ledger three$")
    public void click_show_on_annual_student_ledger_three() throws Throwable {
        new AnnualStudentLedger3(driver).clickShow();
    }

//advance payment report
    @When("^user open advance payment report$")
    public void user_open_advance_payment_report() throws Throwable {
        new AdvancePaymentReport(driver).openAdvancePaymentReport();
    }

    @When("^select installment \"([^\"]*)\" on advance payment report$")
    public void select_installment_on_advance_payment_report(String arg1) throws Throwable {
        new AdvancePaymentReport(driver).selectInstallment(arg1);
    }

    @When("^verify validation when no class is selected on advance payment report$")
    public void verify_validation_when_no_class_is_selected_on_advance_payment_report() throws Throwable {
        new AdvancePaymentReport(driver).validateClass();
    }

    @When("^verify validation when no till date is selected on advance payment report$")
    public void verify_validation_when_no_till_date_is_selected_on_advance_payment_report() throws Throwable {
        new AdvancePaymentReport(driver).validateTillDate();
    }

    @When("^click show on advance payment report$")
    public void click_show_on_advance_payment_report() throws Throwable {
        new AdvancePaymentReport(driver).clickShow();
    }

    @When("^verify validation when no installment is selected on advance payment report$")
    public void verify_validation_when_no_installment_is_selected_on_advance_payment_report() throws Throwable {
        new AdvancePaymentReport(driver).validateInstallment();
    }

    @When("^select school with index \"([^\"]*)\" on advance payment report$")
    public void select_school_with_index_on_advance_payment_report(int arg1) throws Throwable {
        new AdvancePaymentReport(driver).selectSchool(arg1);
    }

    @When("^select installment with index \"([^\"]*)\" on advance payment report$")
    public void select_installment_with_index_on_advance_payment_report(int arg1) throws Throwable {
        new AdvancePaymentReport(driver).selectInstallment(arg1);
    }

    @When("^select class on advance payment report$")
    public void select_class_on_advance_payment_report() throws Throwable {
        new AdvancePaymentReport(driver).selectClass();
    }

    @When("^select fee type with index \"([^\"]*)\" on advance payment report$")
    public void select_fee_type_with_index_on_advance_payment_report(int arg1) throws Throwable {
        new AdvancePaymentReport(driver).selectFeeType(arg1);
    }

//fee defaulter report consolidated
    @Then("^user open fee defaulter report consolidated$")
    public void user_open_fee_defaulter_report_consolidated() throws Throwable {
        new FeeDefaulterReportConsolidated(driver).openFeeDefaulterReportConsolidated();
    }

    @Then("^select school with index \"([^\"]*)\" on fee defaulter report consolidated$")
    public void select_school_with_index_on_fee_defaulter_report_consolidated(int arg1) throws Throwable {
        new FeeDefaulterReportConsolidated(driver).selectSchool(arg1);
    }

    @Then("^select class with index \"([^\"]*)\" on fee defaulter report consolidated$")
    public void select_class_with_index_on_fee_defaulter_report_consolidated(int arg1) throws Throwable {
        new FeeDefaulterReportConsolidated(driver).selectClass(arg1);
    }

    @Then("^select section with index \"([^\"]*)\" on fee defaulter report consolidated$")
    public void select_section_with_index_on_fee_defaulter_report_consolidated(int arg1) throws Throwable {
        new FeeDefaulterReportConsolidated(driver).selectSection(arg1);
    }

    @Then("^select fee type with index \"([^\"]*)\" on fee defaulter report consolidated$")
    public void select_fee_type_with_index_on_fee_defaulter_report_consolidated(int arg1) throws Throwable {
        new FeeDefaulterReportConsolidated(driver).selectFeeType(arg1);
    }

    @Then("^select installment on fee defaulter report consolidated$")
    public void select_installment_on_fee_defaulter_report_consolidated() throws Throwable {
        new FeeDefaulterReportConsolidated(driver).selectInstallment();
    }

    @Then("^select till date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on fee defaulter report consolidated$")
    public void select_till_date_as_month_year_and_day_on_fee_defaulter_report_consolidated(String arg1, String arg2, String arg3) throws Throwable {
        new FeeDefaulterReportConsolidated(driver).selectToDate(arg1, arg2, arg3);
    }

    @Then("^click show on fee defaulter report consolidated$")
    public void click_show_on_fee_defaulter_report_consolidated() throws Throwable {
        new FeeDefaulterReportConsolidated(driver).clickShow();
    }

    @Then("^click date range on fee defaulter report consolidated$")
    public void click_date_range_on_fee_defaulter_report_consolidated() throws Throwable {
        new FeeDefaulterReportConsolidated(driver).clickDateRange();
    }

    @Then("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on fee defaulter report consolidated$")
    public void select_from_date_as_month_year_and_day_on_fee_defaulter_report_consolidated(String arg1, String arg2, String arg3) throws Throwable {
        new FeeDefaulterReportConsolidated(driver).selectFromDate(arg1, arg2, arg3);
    }

    @Then("^click with fine on fee defaulter report consolidated$")
    public void click_with_fine_on_fee_defaulter_report_consolidated() throws Throwable {
        new FeeDefaulterReportConsolidated(driver).clickWithFine();
    }

//fee defaulter installment wise
    @Then("^user open fee defaulter installment wise$")
    public void user_open_fee_defaulter_installment_wise() throws Throwable {
        new FeeDefaulterInstallmentWise(driver).openFeeDefaulterInstallmentWise();
    }

    @Then("^select school with index \"([^\"]*)\" on fee defaulter installment wise$")
    public void select_school_with_index_on_fee_defaulter_installment_wise(int arg1) throws Throwable {
        new FeeDefaulterInstallmentWise(driver).selectSchool(arg1);
    }

    @Then("^select wing with index \"([^\"]*)\" on fee defaulter installment wise$")
    public void select_wing_with_index_on_fee_defaulter_installment_wise(int arg1) throws Throwable {
        new FeeDefaulterInstallmentWise(driver).selectWing(arg1);
    }

    @Then("^select class with index \"([^\"]*)\" on fee defaulter installment wise$")
    public void select_class_with_index_on_fee_defaulter_installment_wise(int arg1) throws Throwable {
        new FeeDefaulterInstallmentWise(driver).selectClass(arg1);
    }

    @Then("^select section with index \"([^\"]*)\" on fee defaulter installment wise$")
    public void select_section_with_index_on_fee_defaulter_installment_wise(int arg1) throws Throwable {
        new FeeDefaulterInstallmentWise(driver).selectSection(arg1);
    }

    @Then("^select board with index \"([^\"]*)\" on fee defaulter installment wise$")
    public void select_board_with_index_on_fee_defaulter_installment_wise(int arg1) throws Throwable {
        new FeeDefaulterInstallmentWise(driver).selectBoard(arg1);
    }

    @Then("^select fee type with index \"([^\"]*)\" on fee defaulter installment wise$")
    public void select_fee_type_with_index_on_fee_defaulter_installment_wise(int arg1) throws Throwable {
        new FeeDefaulterInstallmentWise(driver).selectFeeType(arg1);
    }

    @Then("^select installment on fee defaulter installment wise$")
    public void select_installment_on_fee_defaulter_installment_wise() throws Throwable {
        new FeeDefaulterInstallmentWise(driver).selectInstallment();
    }

    @Then("^select route with index \"([^\"]*)\" on fee defaulter installment wise$")
    public void select_route_with_index_on_fee_defaulter_installment_wise(int arg1) throws Throwable {
        new FeeDefaulterInstallmentWise(driver).selectRoute(arg1);
    }

    @Then("^select vehicle with index \"([^\"]*)\" on fee defaulter installment wise$")
    public void select_vehicle_with_index_on_fee_defaulter_installment_wise(int arg1) throws Throwable {
        new FeeDefaulterInstallmentWise(driver).selectVehicle(arg1);
    }

    @Then("^select till date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on fee defaulter installment wise$")
    public void select_till_date_as_month_year_and_day_on_fee_defaulter_installment_wise(String arg1, String arg2, String arg3) throws Throwable {
        new FeeDefaulterInstallmentWise(driver).selectToDate(arg1, arg2, arg3);
    }

    @Then("^click show on fee defaulter installment wise$")
    public void click_show_on_fee_defaulter_installment_wise() throws Throwable {
        new FeeDefaulterInstallmentWise(driver).clickShow();
    }

    @Then("^click date range on fee defaulter installment wise$")
    public void click_date_range_on_fee_defaulter_installment_wise() throws Throwable {
        new FeeDefaulterInstallmentWise(driver).clickDateRange();
    }

    @Then("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on fee defaulter installment wise$")
    public void select_from_date_as_month_year_and_day_on_fee_defaulter_installment_wise(String arg1, String arg2, String arg3) throws Throwable {
        new FeeDefaulterInstallmentWise(driver).selectFromDate(arg1, arg2, arg3);
    }

    @Then("^click with fine on fee defaulter installment wise$")
    public void click_with_fine_on_fee_defaulter_installment_wise() throws Throwable {
        new FeeDefaulterInstallmentWise(driver).clickWithFine();
    }

//amount without structure report
    @Then("^user open amount without structure report$")
    public void user_open_amount_without_structure_report() throws Throwable {
        new AmountWithoutStructureReport(driver).openAmountWithoutStructureReport();
    }

    @Then("^select year with index \"([^\"]*)\" on amount without structure report$")
    public void select_year_with_index_on_amount_without_structure_report(int arg1) throws Throwable {
        new AmountWithoutStructureReport(driver).selectYear(arg1);
    }

    @Then("^select school with index \"([^\"]*)\" on amount without structure report$")
    public void select_school_with_index_on_amount_without_structure_report(int arg1) throws Throwable {
        new AmountWithoutStructureReport(driver).selectSchool(arg1);
    }

    @Then("^select wing with index \"([^\"]*)\" on amount without structure report$")
    public void select_wing_with_index_on_amount_without_structure_report(int arg1) throws Throwable {
        new AmountWithoutStructureReport(driver).selectWing(arg1);
    }

    @Then("^select class on amount without structure report$")
    public void select_class_on_amount_without_structure_report() throws Throwable {
        new AmountWithoutStructureReport(driver).selectClass();
    }

    @Then("^select board with index \"([^\"]*)\" on amount without structure report$")
    public void select_board_with_index_on_amount_without_structure_report(int arg1) throws Throwable {
        new AmountWithoutStructureReport(driver).selectBoard(arg1);
    }

    @Then("^select head on amount without structure report$")
    public void select_head_on_amount_without_structure_report() throws Throwable {
        new AmountWithoutStructureReport(driver).selectHead();
    }

    @Then("^select user with index \"([^\"]*)\" on amount without structure report$")
    public void select_user_with_index_on_amount_without_structure_report(int arg1) throws Throwable {
        new AmountWithoutStructureReport(driver).selectUser(arg1);
    }

    @Then("^click show on amount without structure report$")
    public void click_show_on_amount_without_structure_report() throws Throwable {
        new AmountWithoutStructureReport(driver).clickShow();
    }

    @Then("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on amount without structure report$")
    public void select_from_date_as_month_year_and_day_on_amount_without_structure_report(String arg1, String arg2, String arg3) throws Throwable {
        new AmountWithoutStructureReport(driver).selectFromDate(arg1, arg2, arg3);
    }

    @Then("^click cancelled fee on amount without structure report$")
    public void click_cancelled_fee_on_amount_without_structure_report() throws Throwable {
        new AmountWithoutStructureReport(driver).clickCancelledFee();
    }

//fee defaulter report with receiving
    @Then("^user open fee defaulter report with receiving$")
    public void user_open_fee_defaulter_report_with_receiving() throws Throwable {
        new FeeDefaulterReportWithReceiving(driver).openFeeDefaulterReportWithReceiving();
    }

    @Then("^select school with index \"([^\"]*)\" on fee defaulter report with receiving$")
    public void select_school_with_index_on_fee_defaulter_report_with_receiving(int arg1) throws Throwable {
        new FeeDefaulterReportWithReceiving(driver).selectSchool(arg1);
    }

    @Then("^select class with index \"([^\"]*)\" on fee defaulter report with receiving$")
    public void select_class_with_index_on_fee_defaulter_report_with_receiving(int arg1) throws Throwable {
        new FeeDefaulterReportWithReceiving(driver).selectClass(arg1);
    }

    @Then("^select section with index \"([^\"]*)\" on fee defaulter report with receiving$")
    public void select_section_with_index_on_fee_defaulter_report_with_receiving(int arg1) throws Throwable {
        new FeeDefaulterReportWithReceiving(driver).selectSection(arg1);
    }

    @Then("^select fee type with index \"([^\"]*)\" on fee defaulter report with receiving$")
    public void select_fee_type_with_index_on_fee_defaulter_report_with_receiving(int arg1) throws Throwable {
        new FeeDefaulterReportWithReceiving(driver).selectFeeType(arg1);
    }

    @Then("^select installment on fee defaulter report with receiving$")
    public void select_installment_on_fee_defaulter_report_with_receiving() throws Throwable {
        new FeeDefaulterReportWithReceiving(driver).selectInstallment();
    }

    @Then("^select till date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on fee defaulter report with receiving$")
    public void select_till_date_as_month_year_and_day_on_fee_defaulter_report_with_receiving(String arg1, String arg2, String arg3) throws Throwable {
        new FeeDefaulterReportWithReceiving(driver).selectToDate(arg1, arg2, arg3);
    }

    @Then("^click show on fee defaulter report with receiving$")
    public void click_show_on_fee_defaulter_report_with_receiving() throws Throwable {
        new FeeDefaulterReportWithReceiving(driver).clickShow();
    }

    @Then("^click date range on fee defaulter report with receiving$")
    public void click_date_range_on_fee_defaulter_report_with_receiving() throws Throwable {
        new FeeDefaulterReportWithReceiving(driver).clickDateRange();
    }

    @Then("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on fee defaulter report with receiving$")
    public void select_from_date_as_month_year_and_day_on_fee_defaulter_report_with_receiving(String arg1, String arg2, String arg3) throws Throwable {
        new FeeDefaulterReportWithReceiving(driver).selectFromDate(arg1, arg2, arg3);
    }

    @Then("^click with fine on fee defaulter report with receiving$")
    public void click_with_fine_on_fee_defaulter_report_with_receiving() throws Throwable {
        new FeeDefaulterReportWithReceiving(driver).clickWithFine();
    }

//fee defaulter slip
    @Then("^user open fee defaulter report slip$")
    public void user_open_fee_defaulter_report_slip() throws Throwable {
        new FeeDefaulterSlip(driver).openFeeDefaulterSlip();
    }

    @Then("^select school with index \"([^\"]*)\" on fee defaulter report slip$")
    public void select_school_with_index_on_fee_defaulter_report_slip(int arg1) throws Throwable {
        new FeeDefaulterSlip(driver).selectSchool(arg1);
    }

    @Then("^select class with index \"([^\"]*)\" on fee defaulter report slip$")
    public void select_class_with_index_on_fee_defaulter_report_slip(int arg1) throws Throwable {
        new FeeDefaulterSlip(driver).selectClass(arg1);
    }

    @Then("^select section with index \"([^\"]*)\" on fee defaulter report slip$")
    public void select_section_with_index_on_fee_defaulter_report_slip(int arg1) throws Throwable {
        new FeeDefaulterSlip(driver).selectSection(arg1);
    }

    @Then("^select fee type with index \"([^\"]*)\" on fee defaulter report slip$")
    public void select_fee_type_with_index_on_fee_defaulter_report_slip(int arg1) throws Throwable {
        new FeeDefaulterSlip(driver).selectFeeType(arg1);
    }

    @Then("^select installment on fee defaulter report slip$")
    public void select_installment_on_fee_defaulter_report_slip() throws Throwable {
        new FeeDefaulterSlip(driver).selectInstallment();
    }

    @Then("^select till date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on fee defaulter report slip$")
    public void select_till_date_as_month_year_and_day_on_fee_defaulter_report_slip(String arg1, String arg2, String arg3) throws Throwable {
        new FeeDefaulterSlip(driver).selectToDate(arg1, arg2, arg3);
    }

    @Then("^click show on fee defaulter report slip$")
    public void click_show_on_fee_defaulter_report_slip() throws Throwable {
        new FeeDefaulterSlip(driver).clickShow();
    }

    @Then("^click date range on fee defaulter report slip$")
    public void click_date_range_on_fee_defaulter_report_slip() throws Throwable {
       new FeeDefaulterSlip(driver).clickDateRange();
    }

    @Then("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on fee defaulter report slip$")
    public void select_from_date_as_month_year_and_day_on_fee_defaulter_report_slip(String arg1, String arg2, String arg3) throws Throwable {
        new FeeDefaulterSlip(driver).selectFromDate(arg1, arg2, arg3);
    }

    @Then("^click with fine on fee defaulter report slip$")
    public void click_with_fine_on_fee_defaulter_report_slip() throws Throwable {
        new FeeDefaulterSlip(driver).clickWithFine();
    }

//unpaid student report
    @Then("^user open unpaid student report$")
    public void user_open_unpaid_student_report() throws Throwable {
        new UnpaidStudentReport(driver).openUnpaidStudentReport();
    }

    @Then("^select school with index \"([^\"]*)\" on unpaid student report$")
    public void select_school_with_index_on_unpaid_student_report(int arg1) throws Throwable {
        new UnpaidStudentReport(driver).selectSchool(arg1);
    }

    @Then("^select class with index \"([^\"]*)\" on unpaid student report$")
    public void select_class_with_index_on_unpaid_student_report(int arg1) throws Throwable {
        new UnpaidStudentReport(driver).selectClass(arg1);
    }

    @Then("^select section with index \"([^\"]*)\" on unpaid student report$")
    public void select_section_with_index_on_unpaid_student_report(int arg1) throws Throwable {
        new UnpaidStudentReport(driver).selectSection(arg1);
    }

    @Then("^select fee type with index \"([^\"]*)\" on unpaid student report$")
    public void select_fee_type_with_index_on_unpaid_student_report(int arg1) throws Throwable {
        new UnpaidStudentReport(driver).selectFeeType(arg1);
    }

    @Then("^select installment on unpaid student report$")
    public void select_installment_on_unpaid_student_report() throws Throwable {
        new UnpaidStudentReport(driver).selectInstallment();
    }

    @Then("^select till date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on unpaid student report$")
    public void select_till_date_as_month_year_and_day_on_unpaid_student_report(String arg1, String arg2, String arg3) throws Throwable {
        new UnpaidStudentReport(driver).selectToDate(arg1, arg2, arg3);
    }

    @Then("^select range with index \"([^\"]*)\" on unpaid student report$")
    public void select_range_with_index_on_unpaid_student_report(int arg1) throws Throwable {
        new UnpaidStudentReport(driver).selectRange(arg1);
    }

    @Then("^enter range value \"([^\"]*)\" on unpaid student report$")
    public void enter_range_value_on_unpaid_student_report(String arg1) throws Throwable {
        new UnpaidStudentReport(driver).enterRangeValue(arg1);
    }

    @Then("^click show on unpaid student report$")
    public void click_show_on_unpaid_student_report() throws Throwable {
        new UnpaidStudentReport(driver).clickShow();
    }

    @Then("^select select cheque clearance date on unpaid student report$")
    public void select_select_cheque_clearance_date_on_unpaid_student_report() throws Throwable {
        new UnpaidStudentReport(driver).clickChequeClearanceDate();
    }

    @Then("^select date range on unpaid student report$")
    public void select_date_range_on_unpaid_student_report() throws Throwable {
        new UnpaidStudentReport(driver).clickDateRange();
    }

    @Then("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on unpaid student report$")
    public void select_from_date_as_month_year_and_day_on_unpaid_student_report(String arg1, String arg2, String arg3) throws Throwable {
        new UnpaidStudentReport(driver).selectFromDate(arg1, arg2, arg3);
    }

    @Then("^click with fine on unpaid student report$")
    public void click_with_fine_on_unpaid_student_report() throws Throwable {
        new UnpaidStudentReport(driver).clickWithFine();
    }

    @Then("^select radio button \"([^\"]*)\" head or headwise on unpaid student report$")
    public void select_radio_button_head_or_headwise_on_unpaid_student_report(String arg1) throws Throwable {
        new UnpaidStudentReport(driver).clickButtonhead(arg1);
    }

    @Then("^select radio button \"([^\"]*)\" on unpaid student report$")
    public void select_radio_button_on_unpaid_student_report(String arg1) throws Throwable {
        new UnpaidStudentReport(driver).clickButton(arg1);
    }

    @Then("^select class on unpaid student report$")
    public void select_class_on_unpaid_student_report() throws Throwable {
        new UnpaidStudentReport(driver).selectClass();
    }

//fee defaulter list
    @Then("^user open fee defaulter list$")
    public void user_open_fee_defaulter_list() throws Throwable {
        new FeeDefaulterList(driver).openFeeDefaulterList();
    }

    @Then("^select school with index \"([^\"]*)\" on fee defaulter list$")
    public void select_school_with_index_on_fee_defaulter_list(int arg1) throws Throwable {
        new FeeDefaulterList(driver).selectSchool(arg1);
    }

    @Then("^select wing with index \"([^\"]*)\" fee defaulter list$")
    public void select_wing_with_index_fee_defaulter_list(int arg1) throws Throwable {
        new FeeDefaulterList(driver).selectWing(arg1);
    }

    @Then("^select class with index \"([^\"]*)\" on fee defaulter list$")
    public void select_class_with_index_on_fee_defaulter_list(int arg1) throws Throwable {
        new FeeDefaulterList(driver).selectClass(arg1);
    }

    @Then("^select section with index \"([^\"]*)\" on fee defaulter list$")
    public void select_section_with_index_on_fee_defaulter_list(int arg1) throws Throwable {
        new FeeDefaulterList(driver).selectSection(arg1);
    }

    @Then("^select board with index \"([^\"]*)\" on fee defaulter list$")
    public void select_board_with_index_on_fee_defaulter_list(int arg1) throws Throwable {
        new FeeDefaulterList(driver).selectBoard(arg1);
    }

    @Then("^select fee type with index \"([^\"]*)\" on fee defaulter list$")
    public void select_fee_type_with_index_on_fee_defaulter_list(int arg1) throws Throwable {
        new FeeDefaulterList(driver).selectFeeType(arg1);
    }

    @Then("^select installment on fee defaulter list$")
    public void select_installment_on_fee_defaulter_list() throws Throwable {
        new FeeDefaulterList(driver).selectInstallment();
    }

    @Then("^select till date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on fee defaulter list$")
    public void select_till_date_as_month_year_and_day_on_fee_defaulter_list(String arg1, String arg2, String arg3) throws Throwable {
        new FeeDefaulterList(driver).selectToDate(arg1, arg2, arg3);
    }

    @Then("^select range with index \"([^\"]*)\" on fee defaulter list$")
    public void select_range_with_index_on_fee_defaulter_list(int arg1) throws Throwable {
        new FeeDefaulterList(driver).selectRange(arg1);
    }

    @Then("^enter range value \"([^\"]*)\" on fee defaulter list$")
    public void enter_range_value_on_fee_defaulter_list(String arg1) throws Throwable {
        new FeeDefaulterList(driver).enterRangeValue(arg1);
    }

    @Then("^click show on fee defaulter list$")
    public void click_show_on_fee_defaulter_list() throws Throwable {
        new FeeDefaulterList(driver).clickShow();
    }

    @Then("^select radio button \"([^\"]*)\" on fee defaulter list$")
    public void select_radio_button_on_fee_defaulter_list(String arg1) throws Throwable {
        new FeeDefaulterList(driver).clickButton(arg1);
    }

    @Then("^select date range on fee defaulter list$")
    public void select_date_range_on_fee_defaulter_list() throws Throwable {
        new FeeDefaulterList(driver).clickDateRange();
    }

    @Then("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on fee defaulter list$")
    public void select_from_date_as_month_year_and_day_on_fee_defaulter_list(String arg1, String arg2, String arg3) throws Throwable {
        new FeeDefaulterList(driver).selectFromDate(arg1, arg2, arg3);
    }

    @Then("^select radio button \"([^\"]*)\" head or headwise on fee defaulter list$")
    public void select_radio_button_head_or_headwise_on_fee_defaulter_list(String arg1) throws Throwable {
        new FeeDefaulterList(driver).clickButtonhead(arg1);
    }

    @Then("^click with fine on fee defaulter list$")
    public void click_with_fine_on_fee_defaulter_list() throws Throwable {
        new FeeDefaulterList(driver).clickWithFine();
    }

    @Then("^click header with class group on fee defaulter list$")
    public void click_header_with_class_group_on_fee_defaulter_list() throws Throwable {
        new FeeDefaulterList(driver).clickHeaderWithClassGroup();
    }

    @Then("^select select cheque clearance date on fee defaulter list$")
    public void select_select_cheque_clearance_date_on_fee_defaulter_list() throws Throwable {
        new FeeDefaulterList(driver).clickChequeClearanceDate();
    }

    @Then("^select class on fee defaulter list$")
    public void select_class_on_fee_defaulter_list() throws Throwable {
        new FeeDefaulterList(driver).selectClass();
    }

//fees concession and dues
    @When("^user open fees concession and dues$")
    public void user_open_fees_concession_and_dues() throws Throwable {
        new FeesConcessionAndDues(driver).openFeesConcessionAndDues();
    }

    @When("^verify validation when no class is selected on fees concession and dues$")
    public void verify_validation_when_no_class_is_selected_on_fees_concession_and_dues() throws Throwable {
        new FeesConcessionAndDues(driver).validateClass();
    }

    @When("^verify validation when no fee type is selected on fees concession and dues$")
    public void verify_validation_when_no_fee_type_is_selected_on_fees_concession_and_dues() throws Throwable {
        new FeesConcessionAndDues(driver).validateFeeType();
    }

    @When("^verify validation when no head is selected on fees concession and dues$")
    public void verify_validation_when_no_head_is_selected_on_fees_concession_and_dues() throws Throwable {
        new FeesConcessionAndDues(driver).validateHead();
    }

    @Then("^verify validation when no installment is selected on fees concession and dues$")
    public void verify_validation_when_no_installment_is_selected_on_fees_concession_and_dues() throws Throwable {
        new FeesConcessionAndDues(driver).validateInstallment();
    }

    @When("^select school with index \"([^\"]*)\" on fees concession and dues$")
    public void select_school_with_index_on_fees_concession_and_dues(int arg1) throws Throwable {
        new FeesConcessionAndDues(driver).selectSchool(arg1);
    }

    @When("^select class on fees concession and dues$")
    public void select_class_on_fees_concession_and_dues() throws Throwable {
        new FeesConcessionAndDues(driver).selectClass();
    }

    @When("^select fee type on fees concession and dues$")
    public void select_fee_type_on_fees_concession_and_dues() throws Throwable {
        new FeesConcessionAndDues(driver).selectFeeType();
    }

    @When("^select head on fees concession and dues$")
    public void select_head_on_fees_concession_and_dues() throws Throwable {
        new FeesConcessionAndDues(driver).selectHead();
    }

    @When("^select installment on fees concession and dues$")
    public void select_installment_on_fees_concession_and_dues() throws Throwable {
        new FeesConcessionAndDues(driver).selectInstallment();
    }

    @When("^select show by with index \"([^\"]*)\" on fees concession and dues$")
    public void select_show_by_with_index_on_fees_concession_and_dues(int arg1) throws Throwable {
        new FeesConcessionAndDues(driver).selectShowBy(arg1);
    }

    @When("^click show on fees concession and dues$")
    public void click_show_on_fees_concession_and_dues() throws Throwable {
        new FeesConcessionAndDues(driver).clickShow();
    }

//cancelled fees receipt report
    @When("^user open cancelled fees receipt report$")
    public void user_open_cancelled_fees_receipt_report() throws Throwable {
        new CancelledFeesReceiptReport(driver).openCancelledFeesReceiptReport();
    }

    @When("^select school with index \"([^\"]*)\" on cancelled fees receipt report$")
    public void select_school_with_index_on_cancelled_fees_receipt_report(int arg1) throws Throwable {
        new CancelledFeesReceiptReport(driver).selectSchool(arg1);
    }

    @When("^select wing with index \"([^\"]*)\" on cancelled fees receipt report$")
    public void select_wing_with_index_on_cancelled_fees_receipt_report(int arg1) throws Throwable {
        new CancelledFeesReceiptReport(driver).selectWing(arg1);
    }

    @When("^select class on cancelled fees receipt report$")
    public void select_class_on_cancelled_fees_receipt_report() throws Throwable {
        new CancelledFeesReceiptReport(driver).selectClass();
    }

    @When("^select board with index \"([^\"]*)\" on cancelled fees receipt report$")
    public void select_board_with_index_on_cancelled_fees_receipt_report(int arg1) throws Throwable {
        new CancelledFeesReceiptReport(driver).selectBoard(arg1);
    }

    @When("^select user with index \"([^\"]*)\" on cancelled fees receipt report$")
    public void select_user_with_index_on_cancelled_fees_receipt_report(int arg1) throws Throwable {
        new CancelledFeesReceiptReport(driver).selectUser(arg1);
    }

    @When("^click show on cancelled fees receipt report$")
    public void click_show_on_cancelled_fees_receipt_report() throws Throwable {
        new CancelledFeesReceiptReport(driver).clickShow();
    }

    @When("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on cancelled fees receipt report$")
    public void select_from_date_as_month_year_and_day_on_cancelled_fees_receipt_report(String arg1, String arg2, String arg3) throws Throwable {
        new CancelledFeesReceiptReport(driver).selectFromDate(arg1, arg2, arg3);
    }

//fees concession
    @When("^select school with index \"([^\"]*)\" on fees concession$")
    public void select_school_with_index_on_fees_concession(int arg1) throws Throwable {
        new FeesConcession(driver).selectSchool(arg1);
    }

    @When("^select wing with index \"([^\"]*)\" on fees concession$")
    public void select_wing_with_index_on_fees_concession(int arg1) throws Throwable {
        new FeesConcession(driver).selectWing(arg1);
    }

    @When("^select class on fees concession$")
    public void select_class_on_fees_concession() throws Throwable {
        new FeesConcession(driver).selectClass();
    }

    @When("^select board with index \"([^\"]*)\" on fees concession$")
    public void select_board_with_index_on_fees_concession(int arg1) throws Throwable {
        new FeesConcession(driver).selectBoard(arg1);
    }

    @When("^select fee type with index \"([^\"]*)\" on fees concession$")
    public void select_fee_type_with_index_on_fees_concession(int arg1) throws Throwable {
        new FeesConcession(driver).selectFeeType(arg1);
    }

    @When("^select head on fees concession$")
    public void select_head_on_fees_concession() throws Throwable {
        new FeesConcession(driver).selectHead();
    }

    @When("^select installment on fees concession$")
    public void select_installment_on_fees_concession() throws Throwable {
        new FeesConcession(driver).selectInstallment();
    }

    @When("^select concession on fees concession$")
    public void select_concession_on_fees_concession() throws Throwable {
        new FeesConcession(driver).selectConcession();
    }

    @When("^click show on fees concession$")
    public void click_show_on_fees_concession() throws Throwable {
        new FeesConcession(driver).clickShow();
    }

    @When("^select radio button \"([^\"]*)\" on fees concession$")
    public void select_radio_button_on_fees_concession(String arg1) throws Throwable {
        new FeesConcession(driver).clickButton(arg1);
    }

    @When("^click paid concession on fees concession$")
    public void click_paid_concession_on_fees_concession() throws Throwable {
        new FeesConcession(driver).clickPaidConcession();
    }

    @When("^click entry time on fees concession$")
    public void click_entry_time_on_fees_concession() throws Throwable {
        new FeesConcession(driver).clickEntryTime();
    }

    @When("^click assigned on fees concession$")
    public void click_assigned_on_fees_concession() throws Throwable {
        new FeesConcession(driver).clickAssigned();
    }

//cheque clearing status report
    @When("^user open cheque clearing status report$")
    public void user_open_cheque_clearing_status_report() throws Throwable {
        new ChequeClearingStatusReport(driver).openChequeClearingStatusReport();
    }

    @When("^select entry mode on cheque clearing status report$")
    public void select_entry_mode_on_cheque_clearing_status_report() throws Throwable {
        new ChequeClearingStatusReport(driver).selectEntryMode();
    }

    @When("^select class on cheque clearing status report$")
    public void select_class_on_cheque_clearing_status_report() throws Throwable {
        new ChequeClearingStatusReport(driver).selectClass();
    }

    @When("^select school with index \"([^\"]*)\" on cheque clearing status report$")
    public void select_school_with_index_on_cheque_clearing_status_report(int arg1) throws Throwable {
        new ChequeClearingStatusReport(driver).selectSchool(arg1);
    }

    @When("^select fee type with index \"([^\"]*)\" on cheque clearing status report$")
    public void select_fee_type_with_index_on_cheque_clearing_status_report(int arg1) throws Throwable {
        new ChequeClearingStatusReport(driver).selectFeeType(arg1);
    }

    @When("^select bank name on cheque clearing status report$")
    public void select_bank_name_on_cheque_clearing_status_report() throws Throwable {
        new ChequeClearingStatusReport(driver).selectBankName();
    }

    @When("^select head on cheque clearing status report$")
    public void select_head_on_cheque_clearing_status_report() throws Throwable {
        new ChequeClearingStatusReport(driver).selectHead();
    }

    @When("^select cheque details on cheque clearing status report$")
    public void select_cheque_details_on_cheque_clearing_status_report() throws Throwable {
        new ChequeClearingStatusReport(driver).selectChequeDetails();
    }

    @When("^select user with index \"([^\"]*)\" on cheque clearing status report$")
    public void select_user_with_index_on_cheque_clearing_status_report(int arg1) throws Throwable {
        new ChequeClearingStatusReport(driver).selectUser(arg1);
    }

    @When("^select clearing status with index \"([^\"]*)\" on cheque clearing status report$")
    public void select_clearing_status_with_index_on_cheque_clearing_status_report(int arg1) throws Throwable {
        new ChequeClearingStatusReport(driver).selectClearingStatus(arg1);
    }

    @When("^click show on cheque clearing status report$")
    public void click_show_on_cheque_clearing_status_report() throws Throwable {
        new ChequeClearingStatusReport(driver).clickShow();
    }

    @When("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on cheque clearing status report$")
    public void select_from_date_as_month_year_and_day_on_cheque_clearing_status_report(String arg1, String arg2, String arg3) throws Throwable {
        new ChequeClearingStatusReport(driver).selectFromDate(arg1, arg2, arg3);
    }

    @When("^click receipt no range on cheque clearing status report$")
    public void click_receipt_no_range_on_cheque_clearing_status_report() throws Throwable {
        new ChequeClearingStatusReport(driver).clickReceiptRange();
    }

    @When("^enter value \"([^\"]*)\" in receipt from on cheque clearing status report$")
    public void enter_value_in_receipt_from_on_cheque_clearing_status_report(String arg1) throws Throwable {
        new ChequeClearingStatusReport(driver).enterReceiptFrom(arg1);
    }

    @When("^enter value \"([^\"]*)\" in receipt to on cheque clearing status report$")
    public void enter_value_in_receipt_to_on_cheque_clearing_status_report(String arg1) throws Throwable {
        new ChequeClearingStatusReport(driver).enterReceiptTo(arg1);
    }

    @When("^select radio button \"([^\"]*)\" on cheque clearing status report$")
    public void select_radio_button_on_cheque_clearing_status_report(String arg1) throws Throwable {
        new ChequeClearingStatusReport(driver).clickButton(arg1);
    }

//fees concession install head wise
    @When("^user open fees concession install head wise$")
    public void user_open_fees_concession_install_head_wise() throws Throwable {
        new FeesConcessionInstallHeadWise(driver).openFeesConcessionInstallHeadWise();
    }

    @When("^select school with index \"([^\"]*)\" on fees concession install head wise$")
    public void select_school_with_index_on_fees_concession_install_head_wise(int arg1) throws Throwable {
        new FeesConcessionInstallHeadWise(driver).selectSchool(arg1);
    }

    @When("^select wing with index \"([^\"]*)\" on fees concession install head wise$")
    public void select_wing_with_index_on_fees_concession_install_head_wise(int arg1) throws Throwable {
        new FeesConcessionInstallHeadWise(driver).selectWing(arg1);
    }

    @When("^select class on fees concession install head wise$")
    public void select_class_on_fees_concession_install_head_wise() throws Throwable {
        new FeesConcessionInstallHeadWise(driver).selectClass();
    }

    @When("^select board with index \"([^\"]*)\" on fees concession install head wise$")
    public void select_board_with_index_on_fees_concession_install_head_wise(int arg1) throws Throwable {
        new FeesConcessionInstallHeadWise(driver).selectBoard(arg1);
    }

    @When("^select fee type with index \"([^\"]*)\" on fees concession install head wise$")
    public void select_fee_type_with_index_on_fees_concession_install_head_wise(int arg1) throws Throwable {
        new FeesConcessionInstallHeadWise(driver).selectFeeType(arg1);
    }

    @When("^select installment on fees concession install head wise$")
    public void select_installment_on_fees_concession_install_head_wise() throws Throwable {
        new FeesConcessionInstallHeadWise(driver).selectInstallment();
    }

    @When("^select concession type on fees concession install head wise$")
    public void select_concession_type_on_fees_concession_install_head_wise() throws Throwable {
        new FeesConcessionInstallHeadWise(driver).selectConcessionType();
    }

    @When("^select concession on fees concession install head wise$")
    public void select_concession_on_fees_concession_install_head_wise() throws Throwable {
        new FeesConcessionInstallHeadWise(driver).selectConcession();
    }

    @When("^select head on fees concession install head wise$")
    public void select_head_on_fees_concession_install_head_wise() throws Throwable {
        new FeesConcessionInstallHeadWise(driver).selectHead();
    }

    @When("^click show on fees concession install head wise$")
    public void click_show_on_fees_concession_install_head_wise() throws Throwable {
        new FeesConcessionInstallHeadWise(driver).clickShow();
    }

    @When("^select radio button \"([^\"]*)\" on fees concession install head wise$")
    public void select_radio_button_on_fees_concession_install_head_wise(String arg1) throws Throwable {
        new FeesConcessionInstallHeadWise(driver).clickButton(arg1);
    }

    @When("^click paid concession on fees concession install head wise$")
    public void click_paid_concession_on_fees_concession_install_head_wise() throws Throwable {
        new FeesConcessionInstallHeadWise(driver).clickPaidConcession();
    }

    @When("^click entry time on fees concession install head wise$")
    public void click_entry_time_on_fees_concession_install_head_wise() throws Throwable {
        new FeesConcessionInstallHeadWise(driver).clickEntryTime();
    }

    @When("^click assigned on fees concession install head wise$")
    public void click_assigned_on_fees_concession_install_head_wise() throws Throwable {
        new FeesConcessionInstallHeadWise(driver).clickAssigned();
    }

    @When("^click entry time concession date wise on fees concession install head wise$")
    public void click_entry_time_concession_date_wise_on_fees_concession_install_head_wise() throws Throwable {
        new FeesConcessionInstallHeadWise(driver).clickEntryTimeConcessionDateWise();
    }
}