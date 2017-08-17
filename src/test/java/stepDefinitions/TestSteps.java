package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pageObjects.globalMastersPageObjects.*;
import pageObjects.transactionReportPageObjects.DailyFeeCollection;
import pageObjects.transactionReportPageObjects.DailyFeeCollectionDateWiseWithRemark;

import static webDriver.AppDriver.driver;

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

    @When("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on daily fee collection$")
    public void select_from_date_as_month_year_and_day_on_daily_fee_collection(String arg1, String arg2, String arg3) throws Throwable {
        new DailyFeeCollection(driver).selectFromDate(arg1, arg2, arg3);
    }

    @When("^select to date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on daily fee collection$")
    public void select_to_date_as_month_year_and_day_on_daily_fee_collection(String arg1, String arg2, String arg3) throws Throwable {
        new DailyFeeCollection(driver).selectToDate(arg1, arg2, arg3);
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

    @When("^enter character \"([^\"]*)\" in receipt from on daily fee collection date wise with remark$")
    public void enter_character_in_receipt_from_on_daily_fee_collection_date_wise_with_remark(String arg1) throws Throwable {
        new DailyFeeCollectionDateWiseWithRemark(driver).enterReceiptFrom(arg1);
        new DailyFeeCollectionDateWiseWithRemark(driver).pressEnterInReceiptFrom();
    }

    @Then("^verify numeric validation for receipt from on daily fee collection date wise with remark$")
    public void verify_numeric_validation_for_receipt_from_on_daily_fee_collection_date_wise_with_remark() throws Throwable {
        new DailyFeeCollectionDateWiseWithRemark(driver).validateReceiptFromMessage();
    }

    @Then("^enter character \"([^\"]*)\" in receipt to on daily fee collection date wise with remark$")
    public void enter_character_in_receipt_to_on_daily_fee_collection_date_wise_with_remark(String arg1) throws Throwable {
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
}
