package web;

import model.City;
import service.WeatherApiClient;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/WeatherServlet")
public class WeatherServlet extends HttpServlet {



    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {


            printWeather(req, resp);
    }


    private void printWeather (HttpServletRequest request, HttpServletResponse response) throws IOException {

        String cityName = request.getParameter("name");

        WeatherApiClient weatherApiClient = new WeatherApiClient();
        City city = weatherApiClient.getCityByName(cityName);


        response.setContentType("text/html");

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<h1>Pogoda dla miasta: "+city.getName()+"</h1><br>");
        stringBuilder.append("Cisnienie: "+city.getMain().getPressure()+" hPa<br>");
        stringBuilder.append("Temperatura: "+city.getMain().getTemp()+" C<br>");
        stringBuilder.append("Zachmurzenie: "+city.getClouds().getAll()+" %<br>");
        stringBuilder.append("Predkosc wiatru: "+city.getWind().getSpeed()+" m/s<br>");

        response.getWriter().println(stringBuilder.toString());



    }
}