package ec.utb.WebLibraryProject.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

//Author: Benjamin Boson
public class CreateBookForm {

    @NotBlank(message = "Title is required")
    @Size(min = 2, max = 255, message = "Title needs to be between 2-255 characters")
    private String title;
    @NotBlank(message = "Author is required")
    @Size(min = 2, max = 255, message = "Author needs to be between 2-255 characters")
    private String author;
    private String maxLoanDays;


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMaxLoanDays() {
        return maxLoanDays;
    }

    public void setMaxLoanDays(String maxLoanDays) {
        this.maxLoanDays = maxLoanDays;
    }
}
