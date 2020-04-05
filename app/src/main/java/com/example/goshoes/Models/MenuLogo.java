package com.example.goshoes.Models;

public class MenuLogo {
    private String logo;
        private String name;

        public String getLogo() {

            return logo;
        }

        public void setLogo(String logo) {
            this.logo = logo;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public MenuLogo(String logo, String name) {
            this.logo = logo;
            this.name = name;
        }


    }


