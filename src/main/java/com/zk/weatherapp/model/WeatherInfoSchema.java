package com.zk.weatherapp.model;

import java.util.List;

public class WeatherInfoSchema {
    private Integer id;
    private Coord coord;
    private List<Weather> weather = null;
    private WeatherInfo main;
    private Wind wind;
    private Clouds clouds;
    private Sys sys;

    private String base;
    private Integer visibility;
    private Integer dt;
    private String name;
    private Integer cod;

    public WeatherInfoSchema() {
    }

    public WeatherInfoSchema(Integer id, Coord coord, List<Weather> weather, WeatherInfo main, Wind wind, Clouds clouds, Sys sys, String base, Integer visibility, Integer dt, String name, Integer cod) {
        this.id = id;
        this.coord = coord;
        this.weather = weather;
        this.main = main;
        this.wind = wind;
        this.clouds = clouds;
        this.sys = sys;
        this.base = base;
        this.visibility = visibility;
        this.dt = dt;
        this.name = name;
        this.cod = cod;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public WeatherInfo getMain() {
        return main;
    }

    public void setMain(WeatherInfo main) {
        this.main = main;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    public Integer getDt() {
        return dt;
    }

    public void setDt(Integer dt) {
        this.dt = dt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }
}
