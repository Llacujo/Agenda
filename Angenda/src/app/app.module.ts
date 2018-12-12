import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { HttpClientModule } from '@angular/common/http';
import {RouterModule} from '@angular/router';
import {appRoutes} from './routingconfig';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListarComponent } from './componentes/listar/listar.component';
import { DetallarComponent } from './componentes/detallar/detallar.component';
import { AnadirComponent } from './componentes/anadir/anadir.component';

@NgModule({
  declarations: [
    AppComponent,
    ListarComponent,
    DetallarComponent,
    AnadirComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    RouterModule.forRoot(appRoutes)
  ],
  exports:[
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }





