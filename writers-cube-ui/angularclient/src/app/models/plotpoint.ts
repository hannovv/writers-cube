export class Plotpoint {

  id : string;
  storyboardId : string;
  description : string;

  constructor(id: string, storyboardId: string, description: string) {
    this.id = id;
    this.storyboardId = storyboardId;
    this.description = description;
  }
}
