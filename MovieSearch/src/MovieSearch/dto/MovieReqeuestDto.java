package MovieSearch.dto;

public class MovieReqeuestDto {

    private String title;

    public MovieReqeuestDto(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }
}
