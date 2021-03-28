import { Component, OnInit } from '@angular/core';
import { ProductListServiceService, Product } from 'src/app/services/product-list-service.service';
import { FormGroup, FormControl } from '@angular/forms';


//product : new product("","",0);

@Component({
  selector: 'app-price-calculator',
  templateUrl: './price-calculator.component.html',
  styleUrls: ['./price-calculator.component.css']
})
export class PriceCalculatorComponent implements OnInit {

 total : any;

 product : Product = new Product("","",0);

  constructor(private httpgetTotal : ProductListServiceService) { }

  ngOnInit(): void {

    
  

  }



  public getTotal(){

    

    this.httpgetTotal.getTotal(this.product).subscribe(

     

      data=>{
        console.log(data);
        this.total = data;
  
      },error =>{
  
        console.log(error)
      }
      
     )


  }

}
