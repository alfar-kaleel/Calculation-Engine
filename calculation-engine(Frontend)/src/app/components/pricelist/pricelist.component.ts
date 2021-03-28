import { Component, OnInit } from '@angular/core';
import { ProductListServiceService } from 'src/app/services/product-list-service.service';

@Component({
  selector: 'app-pricelist',
  templateUrl: './pricelist.component.html',
  styleUrls: ['./pricelist.component.css']
})
export class PricelistComponent implements OnInit {

  prices : any;
  shoes : any;
  

  constructor(private pricegettingservice : ProductListServiceService) { }

  ngOnInit(): void {

    this.pricegettingservice.getPrices().subscribe(

data =>{

  this.prices = data;
  console.log(this.prices);
}

    )


    this.pricegettingservice.getShoeprices().subscribe(

      data =>{

        this.shoes = data;
        console.log(this.shoes)
      }

    )

  }

}
