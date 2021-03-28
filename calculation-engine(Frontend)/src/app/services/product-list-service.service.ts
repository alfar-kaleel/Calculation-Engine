import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';



export class productList {

  constructor(
  public prices : number[]
  
  ){}

  }

  export class Response{

constructor(
public total : number

){}

  }


  export class shoeList{

constructor(

public shoePrices : number[]

){}

  }

export class Product{

constructor(
  public name : String,
  public quantitymode : String,
  public quantity : number

){}

  }
  
  
  
  

@Injectable({
  providedIn: 'root'
})
export class ProductListServiceService {

  
 
  constructor(private httpclient: HttpClient) { }



  public getPrices(){

  return this.httpclient.get<productList>('http://localhost:8080/wel/productList/penguinears');

  }

  public getShoeprices(){
  return this.httpclient.get<shoeList>('http://localhost:8080/wel/productList/horseshoe');

  }

  public getTotal(product : Product){

    return this.httpclient.post<Product>('http://localhost:8080/wel/calculate',product);
  }


}
