from allennlp.predictors.predictor import Predictor
class SemanticModel():
    def __init__():
        self.predictor = Predictor.from_path("https://s3-us-west-2.amazonaws.com/allennlp/models/srl-model-2018.05.25.tar.gz")

    def predict(self, text):
        result = self.predictor.predict(sentence=text)
        return result

