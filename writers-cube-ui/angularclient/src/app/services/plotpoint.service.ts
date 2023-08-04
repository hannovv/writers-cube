import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Plotpoint } from '../models/plotpoint';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PlotpointService {

  private plotPointUrl: string;

  constructor(private http: HttpClient) {
    this.plotPointUrl = 'http://localhost:8080/plotpoints'

  }

  public findPlotPointByStoryboardId(id : string): Observable<Plotpoint[]> {
    return this.http.get<Plotpoint[]>(this.plotPointUrl + '/' + id)
  }

  public addNewPlotPoint(plotpoint : Plotpoint) {
    console.log("calling add new plotpoint")
    return this.http.post<Plotpoint>(this.plotPointUrl, plotpoint);
  }


}
