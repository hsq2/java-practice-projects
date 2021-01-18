public class FetchData {

    private String domain;
    private ServerRepository myRepo;

    public FetchData(ServerRepository myRepo, String domain) {
        this.myRepo = myRepo;
        this.domain = domain;
    }

    public String hitServerRepository() {
        String completeUrl= domain.concat("/datapost");
        return myRepo.getData(completeUrl);
    }
}
