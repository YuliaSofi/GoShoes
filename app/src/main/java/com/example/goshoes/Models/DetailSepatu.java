package com.example.goshoes.Models;

import java.util.ArrayList;

public class DetailSepatu {

    public static String[][] dataSepatu = new String[][] {
            {"https://images.app.goo.gl/c7qQsFwLryTNssTm8",
                    "Converse Men Chucks Taylor 70's",
                    "size 38,39,40",
                    "Rp.899.000,-",
                    ""
            },
            {"https://images.app.goo.gl/ow3VXnXzVfJntNgM6",
                    "Vans SK8HI",
                    "size 39,40,41",
                    "Rp.1.299.000,-",
                    ""
            },
            {"https://images.app.goo.gl/WaUGyj3AbfkCHczx9",
                    "Nike Air Jordan",
                    "size 40,41,42",
                    "Rp.4.999.000,-",
                    ""
            },
            {"https://images.app.goo.gl/R84LfKPyv2VzJVGb6",
                    "New Balance 1500",
                    "Size 38,39,40,41",
                    "Rp.499.000,-",
                    ""
            },
            {"https://images.app.goo.gl/NiRSAsiKTRfWSmZY7",
                    "Adidas Yezzy Boost",
                    "Size 38,39,40,41",
                    "Rp.799.000,-",
                    ""
            },
            {"https://images.app.goo.gl/yLm8WXRUxugcTQ1R9",
                    "Skechers D'Lite Chunky",
                    "Size 38,29,40,41",
                    "Rp.399.000,-",
                    ""
            }
    };

    public static ArrayList<Detail> getListData(){
        Detail detail;
        ArrayList<Detail> list = new ArrayList<>();

        for (String[] dData : dataSepatu){
            detail = new Detail();
            detail.setNamaSepatu(dData[0]);
            detail.setUkuranSepatu(dData[1]);
            detail.setHargaSepatu(dData[2]);
            detail.setBahanSepatu(dData[3]);
            detail.setGambarSepatu(dData[4]);

            list.add(detail);
        }
        return list;
    }
}
