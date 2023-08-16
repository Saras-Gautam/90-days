package post.country.service.service;

import java.util.List;

import post.country.service.Model.Country;

public interface CountryService {
    public List<Country> getAll();
    public Country getById(Integer id);
    public Country save(Country CustCountry);
    public void remove(Country CustCountry);
    public void remove(Integer id);



}
