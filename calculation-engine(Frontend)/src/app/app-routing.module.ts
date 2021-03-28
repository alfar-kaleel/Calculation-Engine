import { NgModule, Component } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PricelistComponent } from './components/pricelist/pricelist.component';
import { PriceCalculatorComponent } from './components/price-calculator/price-calculator.component';

const routes: Routes = [

{
path : 'productlist',
component : PricelistComponent


},

{
path : 'pricecalculator' ,
component : PriceCalculatorComponent


}


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
