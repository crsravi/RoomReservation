import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpClientModule} from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import {A2Edatetimepicker} from 'ng2-eonasdan-datetimepicker';

import { AppComponent } from './app.component';


@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    A2Edatetimepicker,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
