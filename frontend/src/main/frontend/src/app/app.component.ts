import {Component} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Reservation} from "./reservation";
import * as moment from 'moment';



@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent{

  temp:Temp={
  roomList:[],
    reservationList:[],
  options:{
    format:"MM/DD/YYYY h:mm A"
  },
  fromDate:moment(),
  toDate:moment()};

  request:Reservation={
    fromDate: '',
  toDate: '',
  amenities:'',
  location:''
  };

  constructor(private http:HttpClient) {

  }

  get_avail_rooms(){
    this.request.fromDate = this.temp.fromDate.format("YYYY-MM-DDTHH:mm:ss.SSSZ");
    this.request.toDate = this.temp.toDate.format("YYYY-MM-DDTHH:mm:ss.SSSZ");
    console.log(this.request);
    this.http.post('http://localhost:8080/reservation/rooms-available',this.request).subscribe((res)=>{
      this.temp.roomList = res;
    })
  }

  getAllReservations(){
    this.http.get('http://localhost:8080/reservation/').subscribe((res)=>{
      this.temp.reservationList =res;
      for (var i in this.temp.reservationList){
        this.temp.reservationList[i].fromTimeStamp = new Date(this.temp.reservationList[i].fromTimeStamp );
        this.temp.reservationList[i].toTimeStamp = new Date(this.temp.reservationList[i].toTimeStamp);
      }
      console.log(res);
    });
  }


}
class Temp{
  fromDate:any;
  toDate:any;
  roomList:any=[];
  reservationList:any=[];
  options:object;
}
