import { HttpClient, HttpHeaders,HttpParams} from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Plotpoint } from '../models/plotpoint';
import { Observable } from 'rxjs';
import { Storyboard } from '../models/storyboard';
import { Storyboardprompt } from '../models/storyboardprompt';

@Injectable({
  providedIn: 'root'
})
export class PlotpointService {

  private plotPointUrl: string;
  private chatUrl: string;
  storyboardprompt: Storyboardprompt = {prompt: '', storyBoardId: ''};

  constructor(private http: HttpClient) {
    this.plotPointUrl = 'http://localhost:8080/plotpoints'
    this.chatUrl = 'http://localhost:8080/chat'

  }

  public findPlotPointByStoryboardId(id : string): Observable<Plotpoint[]> {
    return this.http.get<Plotpoint[]>(this.plotPointUrl + '/' + id)
  }

  public addNewPlotPoint(plotpoint : Plotpoint) {
    const headers = { 'content-type': 'application/json'}  
    const body=JSON.stringify(plotpoint);
    console.log("calling add new plotpoint");
    const req = this.http.post<Plotpoint>(this.plotPointUrl,body,{'headers':headers});
    req.subscribe();

  }

  public generateRandomPlotpoint(storyboard: Storyboard) {
    const headers = { 'content-type': 'application/json'}
    this.storyboardprompt.prompt = "write me a 1 sentence summary for a plotpoint in a story about " + storyboard.description;
    this.storyboardprompt.storyBoardId = storyboard.id;
    const body= JSON.stringify(this.storyboardprompt);
    console.log("calling generate random plotpoint")
    const req = this.http.post<string>(this.chatUrl, body, {'headers':headers});
    req.subscribe();

  }


}
